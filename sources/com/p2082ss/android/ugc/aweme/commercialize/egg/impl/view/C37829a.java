package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.view;

import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.C37795a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.view.a */
public final class C37829a implements AbstractC37793a {

    /* renamed from: a */
    private CommerceEggLayout f89315a;

    /* renamed from: b */
    private AbstractC37801a f89316b;

    /* renamed from: c */
    private AbstractC37801a f89317c;

    /* renamed from: d */
    private AbstractC37801a f89318d;

    /* renamed from: e */
    private String f89319e = "";

    /* renamed from: f */
    private final ViewStub f89320f;

    static {
        Covode.recordClassIndex(45278);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a
    /* renamed from: a */
    public final void mo65812a() {
        String str = this.f89319e;
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -906336856) {
            if (hashCode == 3321751 && str.equals("like")) {
                C37795a.f89247a = null;
            }
        } else if (str.equals("search")) {
            C37795a.f89248b = null;
        }
        AbstractC37801a aVar = this.f89316b;
        if (aVar != null) {
            aVar.mo65818c();
        }
        AbstractC37801a aVar2 = this.f89317c;
        if (aVar2 != null) {
            aVar2.mo65818c();
        }
        AbstractC37801a aVar3 = this.f89318d;
        if (aVar3 != null) {
            aVar3.mo65818c();
        }
        CommerceEggLayout commerceEggLayout = this.f89315a;
        if (commerceEggLayout != null) {
            commerceEggLayout.removeAllViews();
            commerceEggLayout.setVisibility(8);
        }
    }

    public C37829a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f89320f = viewStub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r3 == null) goto L_0x0027;
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65813a(com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37792d r9) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.egg.impl.view.C37829a.mo65813a(com.ss.android.ugc.aweme.commercialize.egg.d.d):void");
    }
}
