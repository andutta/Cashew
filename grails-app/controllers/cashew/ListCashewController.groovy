package cashew

class ListCashewController {

    def storyboard = { 
		def allStories = ListCashew.list();
		[allStories:allStories]
	}
}
