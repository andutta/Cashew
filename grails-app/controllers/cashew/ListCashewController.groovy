package cashew

class ListCashewController {

    /* Test project */ 
    def storyboard = { 
		def allStories = ListCashew.list();
		[allStories:allStories]
	}
}
