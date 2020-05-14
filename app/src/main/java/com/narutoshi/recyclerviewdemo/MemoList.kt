package com.narutoshi.recyclerviewdemo

class MemoList {
    val memoList = ArrayList<MemoModel>()

    fun setMemoList() {
        memoList.add(
            MemoModel(title = "Memo1", content = "Memo1 Content")
        )
        memoList.add(
            MemoModel(title = "Memo2", content = "Memo2 Content")
        )
        memoList.add(
            MemoModel(title = "Memo3", content = "Memo3 Content")
        )
        memoList.add(
            MemoModel(title = "Memo4", content = "Memo4 Content")
        )
        memoList.add(
            MemoModel(title = "Memo5", content = "Memo5 Content")
        )
        memoList.add(
            MemoModel(title = "Memo6", content = "Memo6 Content")
        )
        memoList.add(
            MemoModel(title = "Memo7", content = "Memo7 Content")
        )
    }
}