/**
 * Created by sbenkhaoua on 02/05/15.
 */
function dashBordCntrl($scope){
    var chatClient = new WebSocket("ws://localhost:8080/app-web/carRoadCountEP");
    chatClient.onmessage = function(evt) {
     console.log(evt.data)

    }
    function send() {
        var input = "sqdqsdqsdsd";


        chatClient.send("sqdqsdqsdsd");
        input.value = "";
    }
    chatClient.onopen=function(){
        console.log("connected")
    }
    chatClient.onerror=function(){
        console.log("error");
    }
    chatClient.onclose=function(){
        console.log('closed')
    }

$scope.onclickfunction=function(){
    send();
}



}
 function carRoadCountCntrl($scope){

     var chatClient = new WebSocket("ws://localhost:8080/app-web/carSpeedEP");
     chatClient.onmessage = function(evt) {
         console.log(evt.data)

     }
     function send() {
         var input = "sqdqsdqsdsd";


         chatClient.send("aaaaaa");
         input.value = "";
     }
     chatClient.onopen=function(){
         console.log("connected")
     }
     chatClient.onerror=function(){
         console.log("error");
     }
     chatClient.onclose=function(){
         console.log('closed')
     }

     $scope.onclickfunction2=function(){
         send();
     }


 }