package com.p2082ss.android.ugc.aweme.multi;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.a */
public abstract class AbstractC60189a implements AbstractC60201c {

    /* renamed from: c */
    public static final C60190a f137202c = new C60190a((byte) 0);

    /* renamed from: a */
    public String f137203a = "";

    /* renamed from: b */
    public boolean f137204b;

    /* renamed from: d */
    private AbstractC60200b f137205d;

    /* renamed from: e */
    private int f137206e = 100;

    static {
        Covode.recordClassIndex(70718);
    }

    /* renamed from: e */
    public boolean mo97875e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a$a */
    public static final class C60190a {
        static {
            Covode.recordClassIndex(70719);
        }

        private C60190a() {
        }

        public /* synthetic */ C60190a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: b */
    public AbstractC60203e mo97872b() {
        return new C60205f(this.f137203a);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public final AbstractC60200b mo97864a() {
        AbstractC60200b bVar = this.f137205d;
        if (bVar == null) {
            C89219l.m154710a("internalContext");
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: c */
    public final int mo97873c() {
        if (mo97875e()) {
            return -1;
        }
        return this.f137206e;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public int mo97874d() {
        if (mo97894f()) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97869a(AbstractC60200b bVar) {
        C89219l.m154721d(bVar, "");
        this.f137205d = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97867a(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    /* renamed from: a */
    public final void mo97868a(AnchorCommonStruct anchorCommonStruct) {
        Integer num;
        String str = "";
        C89219l.m154721d(anchorCommonStruct, str);
        List<AnchorCommonStruct> anchors = mo97864a().mo97883b().getAnchors();
        if (anchors != null) {
            num = Integer.valueOf(anchors.indexOf(anchorCommonStruct));
        } else {
            num = null;
        }
        String logExtra = anchorCommonStruct.getLogExtra();
        if (logExtra != null) {
            str = logExtra;
        }
        this.f137203a = str;
        if (num == null || num.intValue() == -1) {
            this.f137206e = 100;
        } else {
            this.f137206e = num.intValue();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97870a(C60202d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97865a(Activity activity, Dialog dialog) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dialog, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97866a(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97890b(viewGroup, dialog, dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97871a(C60202d dVar, AbstractC34673c cVar, AbstractC33504a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
    }
}
