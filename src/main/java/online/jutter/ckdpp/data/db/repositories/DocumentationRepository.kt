package online.jutter.ckdpp.data.db.repositories

import online.jutter.ckdpp.data.db.BaseRepository
import online.jutter.ckdpp.data.db.ent.DocumentationPageEntity

open class DocumentationRepository : BaseRepository<DocumentationPageEntity>() {
//
//    fun replaceDocumentation(
//        pages: MutableList<DocumentationPageEntity>,
//        lines: MutableList<DocumentationPageLineEntity>,
//    ) = executeTransaction {
//        removeAllInstances(DocumentationPageEntity::class.java)
//        removeAllInstances(DocumentationPageLineEntity::class.java)
//
//        pages.forEach {
//            persist(it)
//        }
//        lines.forEach {
//            persist(it)
//        }
//    }
//
//    fun getLines(pageId: String) = executeTransaction {
//        getQuery<DocumentationPageLineEntity>("pageId" eq pageId)
//    }
}