// create a kafkaesqe client, providing at least one broker
var kafkaesque = require('../lib/kafkaesque')({
    brokers: [{host: 'localhost', port: 9092}],
    clientId: 'fish',
    maxBytes: 2000000
});

// tearup the client
kafkaesque.tearUp(function() {
    // poll the testing topic, kafakesque will determine the lead broker for this
    // partition / topic pairing and will emit messages as they become available
    // kafakesque will maintain the read position on the topic based on calls to
    // commit()
    kafkaesque.poll({topic: 'testing', partition: 0},
        function(err, kafka) {
            // handle each message
            kafka.on('message', function(message, commit) {
                console.log(JSON.stringify(message));
                // once a message has been successfull handled, call commit to advance this
                // consumers position in the topic / parition
                commit();
            });
            // report errors
            kafka.on('error', function(error) {
                console.log(JSON.stringify(error));
            });
        });
});
