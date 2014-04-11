package cashew

class ListCashewController {

    /* Test project for GIT */ 
    def storyboard = { 
		def allStories = ListCashew.list();
		[allStories:allStories] //testing
	}
}
