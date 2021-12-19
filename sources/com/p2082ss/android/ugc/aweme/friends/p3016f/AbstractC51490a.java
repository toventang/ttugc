package com.p2082ss.android.ugc.aweme.friends.p3016f;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.f.a */
public abstract class AbstractC51490a<T extends User> extends AbstractC39100a<T, FriendList<T>> {
    static {
        Covode.recordClassIndex(60755);
    }

    /* access modifiers changed from: protected */
    public abstract void buildFriendItems(FriendList<T> friendList);

    /* access modifiers changed from: protected */
    public abstract void fetchList(int i, int i2, int i3);

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public List<T> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).getFriends();
    }

    public int getRegisteredCount() {
        return ((FriendList) this.mData).getRegisterCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public /* bridge */ /* synthetic */ void handleData(Object obj) {
        handleData((FriendList) ((FriendList) obj));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void refreshList(Object... objArr) {
        fetchList(0, 20, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void loadMoreList(Object... objArr) {
        fetchList(((FriendList) this.mData).getCursor(), 20, ((FriendList) this.mData).getType());
    }

    /* access modifiers changed from: protected */
    public void handleData(FriendList<T> friendList) {
        boolean z;
        FriendList friendList2;
        buildFriendItems(friendList);
        boolean z2 = false;
        if (friendList == null || C13603b.m24435a((Collection) friendList.getFriends())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = friendList;
                return;
            } else if (i == 4) {
                ((FriendList) this.mData).getFriends().addAll(friendList.getFriends());
                ((FriendList) this.mData).setCursor(friendList.getCursor());
                ((FriendList) this.mData).setType(friendList.getType());
                friendList2 = (FriendList) this.mData;
                if (((FriendList) this.mData).isHasMore() && friendList.isHasMore()) {
                    z2 = true;
                }
            } else {
                return;
            }
        } else if (this.mData != null) {
            friendList2 = (FriendList) this.mData;
        } else {
            return;
        }
        friendList2.setHasMore(z2);
    }
}
