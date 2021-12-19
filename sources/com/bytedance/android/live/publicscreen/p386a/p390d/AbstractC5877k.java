package com.bytedance.android.live.publicscreen.p386a.p390d;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.d.k */
public abstract class AbstractC5877k<MESSAGE extends AbstractC6571a> implements AbstractC5872g, AbstractC5875i, AbstractC7556b {

    /* renamed from: b */
    public CharSequence f14735b;

    /* renamed from: c */
    protected C5889g f14736c;

    /* renamed from: d */
    public final MESSAGE f14737d;

    /* renamed from: e */
    private boolean f14738e;

    /* renamed from: f */
    private final C5866a f14739f = new C5866a();

    /* renamed from: g */
    private final C5868c f14740g = new C5868c();

    /* renamed from: h */
    private final C5867b f14741h = new C5867b();

    /* renamed from: com.bytedance.android.live.publicscreen.a.d.k$a */
    public interface AbstractC5878a {
        static {
            Covode.recordClassIndex(6485);
        }

        /* renamed from: a */
        void mo11711a(Bitmap bitmap, AbstractC5877k<? extends AbstractC6571a> kVar);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.a.d.k$b */
    public interface AbstractC5879b {
        static {
            Covode.recordClassIndex(6486);
        }

        /* renamed from: a */
        void mo11712a(Spannable spannable);
    }

    static {
        Covode.recordClassIndex(6484);
    }

    /* renamed from: B */
    public boolean mo11701B() {
        return true;
    }

    /* renamed from: J */
    public ImageModel mo11709J() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract CharSequence mo10374a();

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: e */
    public void mo11677e() {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: f */
    public void mo11678f() {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: g */
    public void mo11679g() {
    }

    /* renamed from: h_ */
    public int mo10712h_() {
        return 2131234662;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public boolean mo11683k() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: m */
    public boolean mo11687m() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: n */
    public boolean mo11688n() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: o */
    public boolean mo11689o() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: p */
    public long mo11690p() {
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: d */
    public final C5866a mo11676d() {
        return this.f14739f;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5870e
    /* renamed from: h */
    public final C5867b mo11680h() {
        return this.f14741h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: i */
    public final boolean mo11681i() {
        return this.f14738e;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: l */
    public final C5868c mo11684l() {
        return this.f14740g;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: G */
    public final int mo11706G() {
        return C3966y.m9663b((int) R.color.a07);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: H */
    public final int mo11707H() {
        return C3966y.m9663b((int) R.color.a07);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: I */
    public final int mo11708I() {
        return C3966y.m9663b((int) R.color.a1l);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: q */
    public final long mo11691q() {
        return this.f14737d.getMessageId();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: r */
    public void mo11692r() {
        mo11676d();
        this.f14735b = null;
    }

    /* renamed from: A */
    public final C5889g mo11700A() {
        C5889g gVar = this.f14736c;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        return gVar;
    }

    /* renamed from: C */
    public final boolean mo11702C() {
        C5889g gVar = this.f14736c;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        return gVar.f14752i;
    }

    /* renamed from: E */
    public final long mo11704E() {
        User b = mo10375b();
        if (b != null) {
            return b.getId();
        }
        return 0;
    }

    /* renamed from: F */
    public C9698b mo11705F() {
        C11778b bVar = this.f14737d.f28134O;
        if (bVar != null) {
            return bVar.f28144j;
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: j */
    public final boolean mo11682j() {
        if (mo11681i()) {
            return false;
        }
        return mo11683k();
    }

    /* renamed from: D */
    public final boolean mo11703D() {
        if (mo11704E() == 0) {
            return false;
        }
        long E = mo11704E();
        C5889g gVar = this.f14736c;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        if (E == gVar.f14746c) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final CharSequence mo11710z() {
        String a;
        if (TextUtils.isEmpty(this.f14735b)) {
            CharSequence charSequence = null;
            if (!mo11701B() || !this.f14737d.mo12726a()) {
                charSequence = mo10374a();
            } else {
                C9698b F = mo11705F();
                if (F != null) {
                    String str = F.f23646b;
                    String str2 = F.f23645a;
                    if (!(str2 == null || str2.length() == 0 || (a = C8983b.m17319a().mo15219a(F.f23645a)) == null || a.length() == 0)) {
                        str = a;
                    }
                    if (!(str == null || str.length() == 0)) {
                        charSequence = C7557c.m15540a(str, F, this);
                    }
                }
            }
            this.f14735b = charSequence;
        }
        return this.f14735b;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g
    /* renamed from: a */
    public final void mo11685a(C5889g gVar) {
        C89219l.m154721d(gVar, "");
        this.f14736c = gVar;
        C89219l.m154721d(gVar, "");
        mo11686b(gVar);
    }

    public AbstractC5877k(MESSAGE message) {
        C89219l.m154721d(message, "");
        this.f14737d = message;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g
    /* renamed from: b */
    public void mo11686b(C5889g gVar) {
        boolean z;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar, "");
        long E = mo11704E();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (E == b.mo13161c()) {
            z = true;
        } else {
            z = false;
        }
        this.f14738e = z;
        this.f14735b = null;
    }
}
