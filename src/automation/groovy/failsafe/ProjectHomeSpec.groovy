package failsafe

import geb.Browser
import geb.spock.GebReportingSpec

class ProjectHomeSpec extends GebReportingSpec {
    def "打开项目主页 https://github.com/zscgrhg/SputnikNew"() {
        when: "go to SputnikNew homepage"
        Browser.drive {
            go "https://github.com/zscgrhg/SputnikNew"
            report "打开主页"
        }
        then: "First page should load"
        title.contains "zscgrhg/SputnikNew"
    }

    def "pom.xml"() {
        when: "点击 pom.xml"
        Browser.drive {
            go "https://github.com/zscgrhg/SputnikNew"
            $("a[title='pom.xml']").click()
        }
        then: "显示pom.xml内容"
        title.contains "SputnikNew/pom.xml"
    }
}
