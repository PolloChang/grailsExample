package ex

/**
 * 範例表單
 */
class Ex100 {

    String note

    static mapping = {
        table:'EX100'
        comment:'範例表單'
        version:true
        id					column:"objid", generator:"sequence", params: [sequence: "hibernate_sequence"]
        note                column:"note"
    }

    static constraints = {
        note				(nullable:true, maxSize: 50)
    }
}
