/**
 * Created by sbenkhaoua on 02/05/15.
 */
var app = angular.module('roadtrafficapps', ['ngRoute']);

app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/dashbord', {
                templateUrl: 'pages/d/dashBord/pages/dashbord.html',
                controller: 'dashBordCntrl'
            }).
            otherwise({
                redirectTo: '/dashbord'
            });
    }]);
angular.module('roadtrafficapps').config(['$controllerProvider', function($controllerProvider) {
    // this option might be handy for migrating old apps, but please don't use it
    // in new ones!
    $controllerProvider.allowGlobals();
}]);
