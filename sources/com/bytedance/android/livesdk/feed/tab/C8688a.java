package com.bytedance.android.livesdk.feed.tab;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.C3852b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3957r;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C6907bh;
import com.bytedance.android.livesdk.feed.C8508c;
import com.bytedance.android.livesdk.feed.C8566f;
import com.bytedance.android.livesdk.feed.C8707u;
import com.bytedance.android.livesdk.feed.p524b.C8496d;
import com.bytedance.android.livesdk.feed.p526c.C8521a;
import com.bytedance.android.livesdk.feed.p536l.C8641a;
import com.bytedance.android.livesdk.feed.tab.p541b.C8697d;
import com.bytedance.android.livesdk.feed.tab.p541b.C8698e;
import com.bytedance.android.livesdk.feed.tab.p541b.C8701g;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesCheckFinishTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesEnterRoomOptiSetting;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.feed.tab.a */
public class C8688a implements AbstractC2702b {
    static {
        Covode.recordClassIndex(9555);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void delayInit() {
        C8521a.m16719a();
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public AbstractC11660n getStartLiveRoomInterceptor() {
        return C6907bh.m14783a();
    }

    public Fragment createLiveFeedFragment() {
        C9520ag agVar;
        List<C9520ag> a = C8701g.m16993b().mo14977a();
        return (C3957r.m9644a(a) || (agVar = a.get(0)) == null || agVar.getStyle() != 4) ? null : null;
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void init() {
        MethodCollector.m26663i(3101);
        if (!C8521a.f21068a) {
            synchronized (C8521a.class) {
                try {
                    if (!C8521a.f21068a) {
                        C8521a.f21068a = true;
                        C3852b.f10640a = new C8496d();
                        if ("local_test".equals(((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel())) {
                            C6802e.f16868c = true;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(3101);
                }
            }
            return;
        }
        MethodCollector.m26664o(3101);
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void requestTabListForyouPage() {
        C8701g b = C8701g.m16993b();
        b.f21453b.mo14986b().mo143292d(new C8697d(b)).mo143292d(new C8698e(b)).mo143254a(new C8693b(this), C8706c.f21471a);
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Fragment createDrawerFeedFragment(AbstractC11761b bVar) {
        return new C8566f().mo14813a(bVar);
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Map<String, Object> getFeedTab(long j) {
        return getFeedTabsMap(j, C8701g.m16993b().mo14977a());
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Map<String, Object> getFeedTabForyouPage(long j) {
        return getFeedTabsMap(j, C8701g.m16993b().f21452a.mo14982b());
    }

    public String getTopLiveTitle(Context context) {
        if (context != null) {
            return context.getString(R.string.dz6);
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$requestTabListForyouPage$0$FeedUrlService(List list) {
        boolean isTabListContentValid = isTabListContentValid(list);
        C3854a.m9453a(4, "LiveIconGeneratorLog", "successfully, showLiveIconEntrance：".concat(String.valueOf(isTabListContentValid)));
        ((IHostAction) C6193a.m13435a(IHostAction.class)).notifyShowLiveIconEntrance(isTabListContentValid);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isTabListContentValid(java.util.List<com.bytedance.android.livesdk.model.C9520ag> r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0009
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return r2
        L_0x000a:
            java.util.Iterator r1 = r4.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.model.ag r0 = (com.bytedance.android.livesdk.model.C9520ag) r0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isItemValid()
            if (r0 != 0) goto L_0x000e
        L_0x0022:
            return r2
        L_0x0023:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.C8688a.isTabListContentValid(java.util.List):boolean");
    }

    static final /* synthetic */ void lambda$requestTabListForyouPage$1$FeedUrlService(Throwable th) {
        C3854a.m9453a(4, "LiveIconGeneratorLog", "there is error" + th.toString());
        ((IHostAction) C6193a.m13435a(IHostAction.class)).notifyShowLiveIconEntrance(false);
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void preloadInboxTopLivesFeedAction(int i) {
        Map<String, Object> feedTab;
        C8641a aVar;
        C8707u a = C8707u.C8708a.m17008a();
        if (InboxTopLivesEnterRoomOptiSetting.INSTANCE.getValue()) {
            String str = "";
            if (i == 1) {
                if (!(C6193a.m13435a(AbstractC2702b.class) == null || (feedTab = ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).getFeedTab(-1)) == null || !(feedTab.get("feed_url") instanceof String))) {
                    str = (String) feedTab.get("feed_url");
                }
                if (!C13627m.m24498a(str)) {
                    a.f21477d = System.currentTimeMillis();
                    a.f21475b = true;
                    C8508c.m16718a(str, "enter_auto_feed_draw_auto_refresh", new C8707u.C8711d(a));
                }
            } else if (i == 3 && System.currentTimeMillis() - a.f21476c > ((long) (InboxTopLivesCheckFinishTimeSetting.INSTANCE.getValue() * 1000)) && !a.f21475b && (aVar = a.f21474a) != null && aVar.f21360a != null) {
                a.f21476c = System.currentTimeMillis();
                String b = a.mo14989b();
                C8707u.C8710c cVar = new C8707u.C8710c(a);
                C89219l.m154721d(b, str);
                C89219l.m154721d(cVar, str);
                ((RoomStatApi) C5805e.m12718a().mo11572a(RoomStatApi.class)).checkRoom(b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8508c.C8509a(cVar), new C8508c.C8510b(cVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> getFeedTabsMap(long r7, java.util.List<com.bytedance.android.livesdk.model.C9520ag> r9) {
        /*
            r6 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r0 = com.bytedance.common.utility.C13617h.m24465a(r9)
            if (r0 == 0) goto L_0x000c
            return r5
        L_0x000c:
            r0 = 0
            java.util.Iterator r4 = r9.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r4.next()
            com.bytedance.android.livesdk.model.ag r0 = (com.bytedance.android.livesdk.model.C9520ag) r0
            if (r0 == 0) goto L_0x0011
            long r2 = r0.getId()
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0011
        L_0x0027:
            java.lang.String r2 = r0.getInnerStreamUrl()
            java.lang.String r1 = "feed_url"
            r5.put(r1, r2)
            int r0 = r0.getStyle()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "feed_style"
            r5.put(r0, r1)
        L_0x003d:
            return r5
        L_0x003e:
            r0 = 0
            java.lang.Object r0 = r9.get(r0)
            com.bytedance.android.livesdk.model.ag r0 = (com.bytedance.android.livesdk.model.C9520ag) r0
            if (r0 == 0) goto L_0x003d
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.C8688a.getFeedTabsMap(long, java.util.List):java.util.Map");
    }
}
