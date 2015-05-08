/**
 * Created by sbenkhaoua on 02/05/15.
 */
function dashBordCntrl($scope,$http){


    $http.get("/app-web/roderic/findCarByRoadCnt/numberofcarbetweendate").success(function(data){
        console.log(data)
    }).error(function(data){
        console.log(data)
    })
    //$http.post("localhost:8090/jobs?appName=roadtraffic&classPath=LuncherCarRoadCount&context=test-context&sync=true"+"").success(function(data){
    //
    //}).error(function(data){
    //
    //});


    //$http({
    //    url:'localhost:8090/jobs?appName=roadtraffic&classPath=LuncherCarRoadCount&context=test-context&sync=true',
    //    method:'post',
    //    headers: {'Content-Type': 'application/x-www-form-urlencoded',
    //        'Accept': '*/*'
    //    },
    //    transformRequest: function(obj) {
    //        var str = [];
    //        for(var p in obj)
    //            str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
    //        var foo= str.join("&");
    //        console.log ("****RETURNING "+foo);
    //        return foo;
    //    },
    //    data: {}
    //
    //})
    //
    //    .success (function()
    //{console.log("****YAY");
    //})
    //    .error(function(data, status, headers, config)
    //    {
    //        console.log("***OOPS "+status + " H: "+data);
    //    });
  //$http.get("localhost:8090/jobs/").success(function(data){
  //  console.log(data)
  //}).error(function(data){
  //  console.log(data)
  //});
  //  $.ajax({
  //      url: "localhost:8090/jobs",
  //      data: {
  //      },
  //      success: function( data ) {
  //          console.log(data);
  //      },
  //      error: function( data ) {
  //          console.log(data);
  //      }
  //  });



 //function carRoadCountCntrl($scope){
 //
 //    var chatClient = new WebSocket("ws://localhost:8585/app-web/carSpeedEP");
 //    chatClient.onmessage = function(evt) {
 //        console.log(evt.data)
 //
 //    }
 //    function send() {
 //        var input = "sqdqsdqsdsd";
 //
 //
 //        chatClient.send("aaaaaa");
 //        input.value = "";
 //    }
 //    chatClient.onopen=function(){
 //        console.log("connected")
 //    }
 //    chatClient.onerror=function(){
 //        console.log("error");
 //    }
 //    chatClient.onclose=function(){
 //        console.log('closed')
 //    }
 //
 //    $scope.onclickfunction2=function(){
 //        send();
 //    }
 //

 }