package com.narutoshi.recyclerviewdemo

class MemoList {
    val memoItems = ArrayList<MemoModel>()

    fun setMemoList() {
        memoItems.add(
            MemoModel(title = "Memo1", content = "Memo1 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo2", content = "Memo2 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo3", content = "Memo3 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo4", content = "Memo4 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo5", content = "Memo5 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo6", content = "Memo6 Content")
        )
        memoItems.add(
            MemoModel(title = "Memo7", content = "Memo7 Content")
        )
    }
}