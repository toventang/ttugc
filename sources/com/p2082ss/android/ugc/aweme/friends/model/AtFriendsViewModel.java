package com.p2082ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34911d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel */
public final class AtFriendsViewModel {
    public static final Companion Companion = new Companion(null);
    public boolean fiteSameUid;
    public String latestSearchKey = "";
    public List<IMUser> latestSearchUsers = new ArrayList();
    private final AbstractC89244h searchUserService$delegate = C89250i.m154773a((AbstractC89171a) AtFriendsViewModel$searchUserService$2.INSTANCE);

    static {
        Covode.recordClassIndex(60874);
    }

    public final ISearchUserService getSearchUserService() {
        return (ISearchUserService) this.searchUserService$delegate.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(60875);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult */
        public static final class SearchResult {
            public final List<IMUser> allFriends;
            public final List<IMUser> followingFriends;

            static {
                Covode.recordClassIndex(60877);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = searchResult.followingFriends;
                }
                if ((i & 2) != 0) {
                    list2 = searchResult.allFriends;
                }
                return searchResult.copy(list, list2);
            }

            public final SearchResult copy(List<? extends IMUser> list, List<? extends IMUser> list2) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                return new SearchResult(list, list2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchResult)) {
                    return false;
                }
                SearchResult searchResult = (SearchResult) obj;
                return C89219l.m154714a(this.followingFriends, searchResult.followingFriends) && C89219l.m154714a(this.allFriends, searchResult.allFriends);
            }

            public final int hashCode() {
                List<IMUser> list = this.followingFriends;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.allFriends;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                return "SearchResult(followingFriends=" + this.followingFriends + ", allFriends=" + this.allFriends + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public SearchResult(List<? extends IMUser> list, List<? extends IMUser> list2) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                this.followingFriends = list;
                this.allFriends = list2;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends */
        public static final class AllFriends {
            public final List<IMUser> allFollowingFriends;
            public final List<IMUser> filterFriends;
            public final List<Integer> indexLabelCount;
            public final List<String> indexLabels;
            public final List<String> mobRecentUsers;
            public final List<IMUser> mutualFriends;
            public final List<IMUser> recentFriends;

            static {
                Covode.recordClassIndex(60876);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AllFriends copy$default(AllFriends allFriends, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = allFriends.recentFriends;
                }
                if ((i & 2) != 0) {
                    list2 = allFriends.mutualFriends;
                }
                if ((i & 4) != 0) {
                    list3 = allFriends.allFollowingFriends;
                }
                if ((i & 8) != 0) {
                    list4 = allFriends.indexLabels;
                }
                if ((i & 16) != 0) {
                    list5 = allFriends.indexLabelCount;
                }
                if ((i & 32) != 0) {
                    list6 = allFriends.filterFriends;
                }
                if ((i & 64) != 0) {
                    list7 = allFriends.mobRecentUsers;
                }
                return allFriends.copy(list, list2, list3, list4, list5, list6, list7);
            }

            public final AllFriends copy(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5, List<? extends IMUser> list6, List<String> list7) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                C89219l.m154721d(list3, "");
                C89219l.m154721d(list4, "");
                C89219l.m154721d(list5, "");
                C89219l.m154721d(list6, "");
                C89219l.m154721d(list7, "");
                return new AllFriends(list, list2, list3, list4, list5, list6, list7);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AllFriends)) {
                    return false;
                }
                AllFriends allFriends = (AllFriends) obj;
                return C89219l.m154714a(this.recentFriends, allFriends.recentFriends) && C89219l.m154714a(this.mutualFriends, allFriends.mutualFriends) && C89219l.m154714a(this.allFollowingFriends, allFriends.allFollowingFriends) && C89219l.m154714a(this.indexLabels, allFriends.indexLabels) && C89219l.m154714a(this.indexLabelCount, allFriends.indexLabelCount) && C89219l.m154714a(this.filterFriends, allFriends.filterFriends) && C89219l.m154714a(this.mobRecentUsers, allFriends.mobRecentUsers);
            }

            public final int hashCode() {
                List<IMUser> list = this.recentFriends;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.mutualFriends;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.allFollowingFriends;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.indexLabels;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.indexLabelCount;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<IMUser> list6 = this.filterFriends;
                int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
                List<String> list7 = this.mobRecentUsers;
                if (list7 != null) {
                    i = list7.hashCode();
                }
                return hashCode6 + i;
            }

            public final String toString() {
                return "AllFriends(recentFriends=" + this.recentFriends + ", mutualFriends=" + this.mutualFriends + ", allFollowingFriends=" + this.allFollowingFriends + ", indexLabels=" + this.indexLabels + ", indexLabelCount=" + this.indexLabelCount + ", filterFriends=" + this.filterFriends + ", mobRecentUsers=" + this.mobRecentUsers + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public AllFriends(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5, List<? extends IMUser> list6, List<String> list7) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                C89219l.m154721d(list3, "");
                C89219l.m154721d(list4, "");
                C89219l.m154721d(list5, "");
                C89219l.m154721d(list6, "");
                C89219l.m154721d(list7, "");
                this.recentFriends = list;
                this.mutualFriends = list2;
                this.allFollowingFriends = list3;
                this.indexLabels = list4;
                this.indexLabelCount = list5;
                this.filterFriends = list6;
                this.mobRecentUsers = list7;
            }
        }
    }

    public final C1731i<Companion.AllFriends> loadAllFriends() {
        C1731i<Companion.AllFriends> b = C1731i.m5640b(new AtFriendsViewModel$loadAllFriends$1(this), C1731i.f5562a);
        C89219l.m154716b(b, "");
        return b;
    }

    public final void setLatestSearchKey(String str) {
        C89219l.m154721d(str, "");
        this.latestSearchKey = str;
    }

    public final void setLatestSearchUsers(List<IMUser> list) {
        C89219l.m154721d(list, "");
        this.latestSearchUsers = list;
    }

    public final List<String> getMentionBlockedUidsFromRecentContact(C34911d dVar) {
        ArrayList arrayList = new ArrayList();
        for (T t : dVar.f82367b) {
            if (t.f82362b.get(0).f82363a == 6 && t.f82362b.get(0).f82364b == 1) {
                arrayList.add(t.f82361a);
            }
        }
        return arrayList;
    }

    public final boolean latestSearchUsersContain(String str) {
        C89219l.m154721d(str, "");
        Iterator<T> it = this.latestSearchUsers.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().getUid(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    public final List<IMUser> filterSameUser(List<? extends IMUser> list) {
        if (C13603b.m24435a((Collection) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            if (!arrayList.contains(iMUser)) {
                String uid = iMUser.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                    arrayList.add(iMUser);
                }
            }
        }
        return arrayList;
    }

    private final boolean containKeyWord(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    public final C1731i<List<IMUser>> searchKeyWord(String str, List<? extends IMUser> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.latestSearchKey = str;
        C1731i<List<IMUser>> b = C1731i.m5640b(new AtFriendsViewModel$searchKeyWord$1(this, list, str), C1731i.f5562a).mo5538b(new AtFriendsViewModel$searchKeyWord$2(this), C1731i.f5564c);
        C89219l.m154716b(b, "");
        return b;
    }

    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        List<IMUser> searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(list, str);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        for (T t : list) {
            String uniqueId = t.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                String shortId = t.getShortId();
                C89219l.m154716b(shortId, "");
                if (containKeyWord(shortId, lowerCase)) {
                    t.setSearchType(1);
                    searchFollowIMUser.add(t);
                }
            } else {
                String uniqueId2 = t.getUniqueId();
                C89219l.m154716b(uniqueId2, "");
                if (containKeyWord(uniqueId2, lowerCase)) {
                    t.setSearchType(1);
                    searchFollowIMUser.add(t);
                }
            }
        }
        if (this.fiteSameUid) {
            List<IMUser> filterSameUser = filterSameUser(searchFollowIMUser);
            searchFollowIMUser.clear();
            searchFollowIMUser.addAll(filterSameUser);
        }
        return searchFollowIMUser;
    }
}
