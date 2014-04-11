package cashew

class ListCashewController {

    /* Test project for GITHUB */ 
    def storyboard = { 
		def allStories = ListCashew.list();
		[allStories:allStories]
	}
}
