package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.api.C48336j;
import com.p2082ss.android.ugc.aweme.feed.helper.C49646m;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51073b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$1 */
public final class FollowingFeedListModel$loadList$1<T> implements AbstractC88433f {
    final /* synthetic */ int $cursor;
    final /* synthetic */ boolean $isBlueUser;
    final /* synthetic */ int $refreshType;
    final /* synthetic */ String $uid;
    final /* synthetic */ FollowingFeedListModel this$0;

    static {
        Covode.recordClassIndex(58692);
    }

    FollowingFeedListModel$loadList$1(FollowingFeedListModel followingFeedListModel, int i, String str, boolean z, int i2) {
        this.this$0 = followingFeedListModel;
        this.$refreshType = i;
        this.$uid = str;
        this.$isBlueUser = z;
        this.$cursor = i2;
    }

    public final void accept(C48336j jVar) {
        boolean z = true;
        if (jVar.getCode() != 0) {
            Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
            C89219l.m154716b(obtainMessage, "");
            obtainMessage.obj = new RuntimeException(jVar.getMsg());
            this.this$0.mHandler.sendMessage(obtainMessage);
            this.this$0.mIsNewDataEmpty = true;
            return;
        }
        int i = this.$refreshType;
        int i2 = -1;
        if (i == 1) {
            Iterator<String> it = this.this$0.uidList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C89361p.m154872a(it.next(), this.$uid, true)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.this$0.hasMoreHeader = true;
            if (i2 == 0) {
                this.this$0.hasMoreHeader = false;
            } else {
                FollowingFeedListModel followingFeedListModel = this.this$0;
                followingFeedListModel.headerUid = followingFeedListModel.uidList.get(i2 - 1);
                this.this$0.headerNextCursor = 0;
            }
            this.this$0.hasMoreFooter = true;
            if (jVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = jVar.getNextCursor();
            } else if (i2 == this.this$0.uidList.size() - 1) {
                this.this$0.hasMoreFooter = false;
            } else {
                FollowingFeedListModel followingFeedListModel2 = this.this$0;
                followingFeedListModel2.footerUid = followingFeedListModel2.uidList.get(i2 + 1);
                this.this$0.footerNextCursor = 0;
            }
            Map<String, String> map = C49646m.f114271a;
            String str = this.$uid;
            String str2 = jVar.getAwemeList().get(0).aid;
            C89219l.m154716b(str2, "");
            map.put(str, str2);
            if (!jVar.getHasMore()) {
                Map<String, String> map2 = C49646m.f114272b;
                String str3 = this.$uid;
                String str4 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                C89219l.m154716b(str4, "");
                map2.put(str3, str4);
            }
            if (this.$isBlueUser) {
                AbstractC81915c.m141874a(new C51073b(this.$uid));
            }
        } else if (i == 3) {
            if (jVar.getHasMore()) {
                this.this$0.headerUid = this.$uid;
                this.this$0.headerNextCursor = jVar.getNextCursor();
            } else {
                Iterator<String> it2 = this.this$0.uidList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C89361p.m154872a(it2.next(), this.$uid, true)) {
                        i2 = i4;
                        if (i2 == 0) {
                            this.this$0.hasMoreHeader = false;
                        }
                    } else {
                        i4++;
                    }
                }
                FollowingFeedListModel followingFeedListModel3 = this.this$0;
                followingFeedListModel3.headerUid = followingFeedListModel3.uidList.get(i2 - 1);
                this.this$0.headerNextCursor = 0;
            }
            if (this.$cursor == 0) {
                Map<String, String> map3 = C49646m.f114272b;
                String str5 = this.$uid;
                String str6 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                C89219l.m154716b(str6, "");
                map3.put(str5, str6);
            }
            if (!jVar.getHasMore()) {
                Map<String, String> map4 = C49646m.f114271a;
                String str7 = this.$uid;
                String str8 = jVar.getAwemeList().get(0).aid;
                C89219l.m154716b(str8, "");
                map4.put(str7, str8);
            }
        } else {
            if (jVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = jVar.getNextCursor();
            } else {
                Iterator<String> it3 = this.this$0.uidList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (C89361p.m154872a(it3.next(), this.$uid, true)) {
                        i2 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 == this.this$0.uidList.size() - 1) {
                    this.this$0.hasMoreFooter = false;
                } else {
                    FollowingFeedListModel followingFeedListModel4 = this.this$0;
                    followingFeedListModel4.footerUid = followingFeedListModel4.uidList.get(i2 + 1);
                    this.this$0.footerNextCursor = 0;
                }
            }
            if (this.$cursor == 0) {
                Map<String, String> map5 = C49646m.f114271a;
                String str9 = this.$uid;
                String str10 = jVar.getAwemeList().get(0).aid;
                C89219l.m154716b(str10, "");
                map5.put(str9, str10);
            }
            if (!jVar.getHasMore()) {
                Map<String, String> map6 = C49646m.f114272b;
                String str11 = this.$uid;
                String str12 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                C89219l.m154716b(str12, "");
                map6.put(str11, str12);
            }
        }
        FollowingFeedListModel followingFeedListModel5 = this.this$0;
        List<Aweme> awemeList = jVar.getAwemeList();
        if (awemeList != null && !awemeList.isEmpty()) {
            z = false;
        }
        followingFeedListModel5.mIsNewDataEmpty = z;
        Message obtainMessage2 = this.this$0.mHandler.obtainMessage(0);
        C89219l.m154716b(obtainMessage2, "");
        obtainMessage2.obj = jVar;
        this.this$0.mHandler.sendMessage(obtainMessage2);
    }
}
