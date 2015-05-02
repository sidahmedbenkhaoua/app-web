/**
 * Created by sbenkhaoua on 02/05/15.
 */
var kafkaesque = require('kafkaesque')({brokers: [{host: 'localhost', port: 9092}],
    clientId: '0',
    group: 'cheese',
    maxBytes: 2000000});
kafkaesque.tearUp(function() {
    kafkaesque.poll({topic: 'carRoadCount', partition: 0}, function(err, kafka) {
        console.log(err);

        kafka.on('message', function(offset, message, commit) {
            console.log(message.value);
            commit();
        });
        kafka.on('error', function(error) {
            console.log(JSON.stringify(error));
        });
    });
});