'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('myApp.services', ['ngResource']).value('version', '0.1').
        factory('myJersey', ['$resource',function($resource){
          return $resource('rest/myresource',{},{
              query:{method:'GET',params:{id:1} ,isArray:true}
          });
  }]).factory('UserService', function($resource) {
	
	return $resource('rest/user/:action', {},
			{
				authenticate: {
					method: 'POST',
					params: {'action' : 'authenticate'},
					headers : {'Content-Type': 'application/x-www-form-urlencoded'}
				},
			}
		);
});
