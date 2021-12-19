package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50394c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50349d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50358f;
import com.p2082ss.android.ugc.aweme.settings.DislikeReason;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a */
public final class C50345a implements AbstractC49691s<C49672ag>, AbstractC49748e, AbstractC50385i {

    /* renamed from: a */
    public final SharePackage f116263a;

    /* renamed from: b */
    public final Aweme f116264b;

    /* renamed from: c */
    public final String f116265c;

    static {
        Covode.recordClassIndex(59473);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo63634a(C49672ag agVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: a */
    public final SharePackage mo85527a() {
        return this.f116263a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e
    /* renamed from: g */
    public final String mo84304g(boolean z) {
        return this.f116265c;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: a */
    public final C50349d mo85526a(AbstractC50382f fVar) {
        C89219l.m154721d(fVar, "");
        return new C50349d(this, fVar);
    }

    /* renamed from: c */
    public final List<C50381e> mo85529c(AbstractC50382f fVar) {
        C89219l.m154721d(fVar, "");
        ArrayList arrayList = new ArrayList();
        try {
            Object a = SettingsManager.m29616a().mo25396a("dislike_reasons", DislikeReason[].class);
            C89219l.m154716b(a, "");
            DislikeReason[] dislikeReasonArr = (DislikeReason[]) a;
            for (DislikeReason dislikeReason : dislikeReasonArr) {
                arrayList.add(new C50381e(new C50394c(dislikeReason.getId(), dislikeReason.getText()), new C50358f(this, fVar)));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164  */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50383g> mo85528b(com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f r10) {
        /*
        // Method dump skipped, instructions count: 521
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a.mo85528b(com.ss.android.ugc.aweme.feed.ui.masklayer2.f):java.util.List");
    }

    public C50345a(Aweme aweme, String str) {
        C89219l.m154721d(str, "");
        this.f116264b = aweme;
        this.f116265c = str;
        ShareService shareService = C68863ah.f154027a;
        Context a = C17867d.m33078a();
        if (aweme == null) {
            C89219l.m154715b();
        }
        this.f116263a = shareService.mo109397a(a, aweme, str, "long_press_download");
    }
}
