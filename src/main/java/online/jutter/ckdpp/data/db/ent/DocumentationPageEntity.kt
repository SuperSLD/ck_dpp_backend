package online.jutter.ckdpp.data.db.ent

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "documentation_pages")
class DocumentationPageEntity {
    @Id
    var id: String = ""
    @Column(name = "title")
    var title: String = ""
    @Column(name = "parent_id")
    var parentId: String? = null
    @Column(name = "number")
    var number: Int = 0
}