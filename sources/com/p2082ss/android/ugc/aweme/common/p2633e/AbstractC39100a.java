package com.p2082ss.android.ugc.aweme.common.p2633e;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.e.a */
public abstract class AbstractC39100a<T, K> extends AbstractC39085b<K> {
    public int mCount;
    public boolean mIsNewDataEmpty;
    public AbstractC39104e mListAdapter;
    public int mListQueryType = 1;

    static {
        Covode.recordClassIndex(46716);
    }

    public abstract List<T> getItems();

    public abstract boolean isHasMore();

    /* access modifiers changed from: protected */
    public void loadLatestList(Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public abstract void loadMoreList(Object... objArr);

    /* access modifiers changed from: protected */
    public boolean needCheckEmptyForQueryType() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    /* access modifiers changed from: protected */
    public int getCurrentIndex() {
        AbstractC39104e eVar = this.mListAdapter;
        if (eVar != null) {
            return eVar.mo67868a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getListCount() {
        AbstractC39104e eVar = this.mListAdapter;
        if (eVar != null) {
            return eVar.mo67869b();
        }
        return -1;
    }

    public boolean isDataEmpty() {
        return C13603b.m24435a((Collection) getItems());
    }

    public boolean insertItem(T t) {
        int size;
        List<T> items = getItems();
        if (items == null) {
            size = 0;
        } else {
            size = items.size();
        }
        return insertItem(t, size);
    }

    public boolean deleteItem(T t) {
        List<T> items = getItems();
        if (C13603b.m24435a((Collection) items)) {
            return false;
        }
        int indexOf = items.indexOf(t);
        boolean remove = items.remove(t);
        if (indexOf >= 0) {
            for (AbstractC39159o oVar : this.mNotifyListeners) {
                if (oVar != null && (oVar instanceof AbstractC39105f)) {
                    ((AbstractC39105f) oVar).mo59498a(indexOf);
                }
            }
        }
        return remove;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (!needCheckEmptyForQueryType() || !isDataEmpty()) {
            this.mListQueryType = ((Integer) objArr[0]).intValue();
        } else {
            this.mListQueryType = 1;
        }
        int i = this.mListQueryType;
        if (i == 1) {
            refreshList(objArr);
        } else if (i == 2) {
            loadLatestList(objArr);
        } else if (i == 4) {
            loadMoreList(objArr);
        }
        return true;
    }

    public boolean insertItem(T t, int i) {
        List<T> items = getItems();
        if (C13603b.m24435a((Collection) items)) {
            items = new ArrayList<>();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (AbstractC39159o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof AbstractC39105f)) {
                ((AbstractC39105f) oVar).mo59499a(items, i);
            }
        }
        return true;
    }

    public boolean insertItemList(List<T> list, int i) {
        List<T> items = getItems();
        if (C13603b.m24435a((Collection) items)) {
            items = new ArrayList<>();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.addAll(i, list);
        if (items.size() == 1) {
            setItems(items);
        }
        for (AbstractC39159o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof AbstractC39105f)) {
                ((AbstractC39105f) oVar).mo59499a(items, i);
            }
        }
        return true;
    }
}
