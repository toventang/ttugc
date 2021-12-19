package com.p2082ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34911d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$loadAllFriends$1 */
public final class AtFriendsViewModel$loadAllFriends$1<V> implements Callable {
    final /* synthetic */ AtFriendsViewModel this$0;

    static {
        Covode.recordClassIndex(60878);
    }

    AtFriendsViewModel$loadAllFriends$1(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    @Override // java.util.concurrent.Callable
    public final AtFriendsViewModel.Companion.AllFriends call() {
        List<IMUser> recentIMUsers;
        Object obj;
        List<IMUser> allFollowIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers();
        ArrayList arrayList = new ArrayList();
        for (T t : allFollowIMUsers) {
            String uid = t.getUid();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                arrayList.add(t);
            }
        }
        List<IMUser> g2 = C89070n.m154585g((Collection) arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        try {
            C34911d a = SummonFriendApi.m95876a(6);
            AtFriendsViewModel atFriendsViewModel = this.this$0;
            C89219l.m154716b(a, "");
            arrayList3.addAll(atFriendsViewModel.getMentionBlockedUidsFromRecentContact(a));
            for (T t2 : a.f82366a) {
                if (arrayList2.size() < 10) {
                    Iterator it = g2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C89219l.m154714a((Object) ((IMUser) obj).getUid(), (Object) t2.getUid())) {
                            break;
                        }
                    }
                    IMUser iMUser = (IMUser) obj;
                    if (iMUser == null) {
                        iMUser = IMUser.fromUser(t2);
                    }
                    C89219l.m154716b(iMUser, "");
                    arrayList2.add(iMUser);
                    String uid2 = iMUser.getUid();
                    C89219l.m154716b(uid2, "");
                    arrayList4.add(uid2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (arrayList2.size() < 10 && (recentIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getRecentIMUsers()) != null) {
            for (T t3 : recentIMUsers) {
                if (arrayList2.size() < 10 && !arrayList2.contains(t3)) {
                    String uid3 = t3.getUid();
                    IAccountUserService g3 = C31575b.m65865g();
                    C89219l.m154716b(g3, "");
                    if (!C89219l.m154714a((Object) uid3, (Object) g3.getCurUserId())) {
                        arrayList2.add(t3);
                        String uid4 = t3.getUid();
                        C89219l.m154716b(uid4, "");
                        arrayList4.add(uid4);
                    }
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (IMUser iMUser2 : g2) {
            if (this.this$0.getSearchUserService().mo106817a() && iMUser2.getFollowStatus() == 2 && g2.size() >= 10) {
                arrayList5.add(iMUser2);
            }
            if (arrayList6.isEmpty() || !TextUtils.equals((CharSequence) arrayList6.get(arrayList6.size() - 1), iMUser2.getInitialLetter())) {
                String initialLetter = iMUser2.getInitialLetter();
                C89219l.m154716b(initialLetter, "");
                arrayList6.add(initialLetter);
                arrayList7.add(1);
            } else {
                int size = arrayList7.size() - 1;
                arrayList7.set(size, Integer.valueOf(((Number) arrayList7.get(size)).intValue() + 1));
            }
        }
        if (!arrayList5.isEmpty()) {
            arrayList6.add(0, "Friend");
            arrayList7.add(0, Integer.valueOf(arrayList5.size()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList6.add(0, "Recent");
            arrayList7.add(0, Integer.valueOf(arrayList2.size()));
        }
        List<IMUser> arrayList8 = new ArrayList<>();
        arrayList8.addAll(arrayList2);
        arrayList8.addAll(arrayList5);
        arrayList8.addAll(g2);
        if (this.this$0.fiteSameUid) {
            arrayList8 = this.this$0.filterSameUser(arrayList8);
        }
        for (IMUser iMUser3 : arrayList8) {
            if (arrayList3.contains(iMUser3.getUid())) {
                iMUser3.setMentionEnabled(false);
            }
        }
        return new AtFriendsViewModel.Companion.AllFriends(arrayList2, arrayList5, g2, arrayList6, arrayList7, arrayList8, arrayList4);
    }
}
