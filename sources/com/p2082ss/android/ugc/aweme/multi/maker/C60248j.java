package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34693m;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.miniapp.p3440a.C59266a;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.j */
public class C60248j extends AbstractC60267o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public static final C60249a f137318d = new C60249a((byte) 0);

    /* renamed from: e */
    private String f137319e = "Resso";

    /* renamed from: f */
    private final String f137320f = "";

    /* renamed from: g */
    private C33744d f137321g;

    static {
        Covode.recordClassIndex(70780);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(299, new RunnableC90250g(C60248j.class, "onH5Finish", C40565d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.j$a */
    public static final class C60249a {
        static {
            Covode.recordClassIndex(70781);
        }

        private C60249a() {
        }

        public /* synthetic */ C60249a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m109861a(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60248j();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public int mo97924k() {
        return EnumC31359ab.ANCHOR_RESSO.getTYPE();
    }

    /* renamed from: u */
    private final String m109851u() {
        String str;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        String a = C59266a.m108964a(str);
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        if (C60249a.m109861a(mo97952r(), "com.moonvideo.android.resso")) {
            return "h5_page";
        }
        return "other_app";
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7 A[ADDED_TO_REGION] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo97934n() {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.maker.C60248j.mo97934n():boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        C89219l.m154721d(list, "");
        if (!mo97934n()) {
            return EnumC60206g.NOT_FOUND;
        }
        return super.mo97888a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_click", m109850e(dVar).f79943a);
        C39162r.m79460a("anchor_entrance_click", mo97954t().f79943a);
    }

    /* renamed from: e */
    private final C33744d m109850e(C33744d dVar) {
        String authorUid = mo97949o().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        C33744d a = dVar.mo59983a("author_id", authorUid);
        String aid = mo97949o().getAid();
        if (aid == null) {
            aid = "";
        }
        C33744d a2 = a.mo59983a("group_id", aid).mo59983a("enter_from", mo97950p()).mo59983a("music_id", C59208ac.m108770d(mo97949o()));
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_show", m109850e(dVar).f79943a);
        C39162r.m79460a("anchor_entrance_show", mo97954t().mo59983a("external_label_id", m109851u()).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.j$c */
    static final class C60251c extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60248j f137324a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137325b;

        static {
            Covode.recordClassIndex(70783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60251c(C60248j jVar, C33744d dVar) {
            super(1);
            this.f137324a = jVar;
            this.f137325b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            if (C60249a.m109861a(this.f137324a.mo97952r(), "com.moonvideo.android.resso")) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                if (Build.VERSION.SDK_INT >= 23) {
                    intent.setData(Uri.parse(anchorCommonStruct2.getUniversalLink()));
                } else {
                    intent.setData(Uri.parse(anchorCommonStruct2.getDeepLink()));
                    C89219l.m154716b(intent.setPackage("com.moonvideo.android.resso"), "");
                }
                Activity r = this.f137324a.mo97952r();
                C84349a.m145093a(intent, r);
                r.startActivity(intent);
            } else {
                C60248j jVar = this.f137324a;
                jVar.mo97945a(new C60250b(jVar, this.f137325b));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String str;
        String schema;
        C89219l.m154721d(dVar, "");
        this.f137321g = dVar;
        C89219l.m154721d(dVar, "");
        mo97945a(new C60251c(this, dVar));
        if (C34693m.C34694a.m70858a(mo97952r(), "com.moonvideo.android.resso")) {
            str = "other_app";
        } else {
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || !C89361p.m154874b(schema, "aweme://lynxview/", false)) {
                str = "webview";
            } else {
                str = "lynx";
            }
        }
        C39162r.m79460a("enter_multi_anchor_detail", m109850e(dVar).mo59983a("click_type", str).f79943a);
        C39162r.m79460a("enter_anchor_detail", mo97954t().mo59983a("click_type", str).mo59983a("external_label_id", m109851u()).f79943a);
    }

    @AbstractC90264r
    public final void onH5Finish(C40565d dVar) {
        Map<String, String> map;
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("anchor_stay_time", mo97954t().mo59981a("duration", dVar.f94911a).f79943a);
        C33744d t = mo97954t();
        C33744d dVar2 = this.f137321g;
        if (dVar2 == null || (map = dVar2.f79943a) == null) {
            map = C89041ag.m154415a();
        }
        C39162r.m79460a("multi_anchor_stay_time", t.mo59985a(new HashMap<>(map)).mo59981a("duration", dVar.f94911a).f79943a);
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.j$b */
    static final class C60250b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60248j f137322a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137323b;

        static {
            Covode.recordClassIndex(70782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60250b(C60248j jVar, C33744d dVar) {
            super(1);
            this.f137322a = jVar;
            this.f137323b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x011e, code lost:
            if (r3 != null) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
            if (r7 == null) goto L_0x0046;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct r9) {
            /*
            // Method dump skipped, instructions count: 397
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.maker.C60248j.C60250b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97871a(C60202d dVar, AbstractC34673c cVar, AbstractC33504a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        super.mo97871a(dVar, cVar, aVar);
        if (!mo97934n()) {
            dVar.f137229a.remove(this);
            int g = dVar.mo97898g();
            if (g == 0) {
                cVar.mo59613c();
            } else if (g != 1) {
                cVar.mo59613c();
                aVar.mo59605b(dVar, cVar);
            } else {
                cVar.mo59613c();
                aVar.mo59604a(dVar, cVar);
            }
        }
    }
}
