package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.e */
public final class C6015e extends AbstractC5877k<C9895y> {
    static {
        Covode.recordClassIndex(6626);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        return 2131234717;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9895y) this.f14737d).f23932g;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public final boolean mo11683k() {
        if (!mo11702C()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        String str = null;
        try {
            String a = C6581g.m14075a(((C9895y) this.f14737d).f23932g);
            String str2 = ((C9895y) this.f14737d).f28134O.f28140f;
            if (str2.startsWith(a + ":")) {
                str = str2.substring(a.length() + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f14737d.f28134O.f28140f;
        }
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        return C6022k.m13209b(((C9895y) this.f14737d).f23932g, "：", str, R.color.a1l, R.color.a07);
    }

    public C6015e(C9895y yVar) {
        super(yVar);
    }

    /* renamed from: a */
    public final void mo11903a(final AbstractC5877k.AbstractC5878a aVar) {
        if (!(this.f14737d.f28134O == null || this.f14737d.f28134O.f28144j == null)) {
            C9698b bVar = this.f14737d.f28134O.f28144j;
            String str = bVar.f23646b;
            if (!((bVar.f23645a == null || C8983b.m17319a().mo15219a(bVar.f23645a) == null) && str == null)) {
                for (C9700d dVar : bVar.f23648d) {
                    if (dVar.f23657a == EnumC11780d.GIFT.getPieceType() && dVar.f23661e != null) {
                        C9904t tVar = ((C9895y) this.f14737d).f23945t;
                        if (tVar != null) {
                            ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(tVar.f23997b, new AbstractC11803e.AbstractC11805b() {
                                /* class com.bytedance.android.live.publicscreen.impl.model.C6015e.C60161 */

                                static {
                                    Covode.recordClassIndex(6627);
                                }

                                @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
                                /* renamed from: a */
                                public final void mo8986a(Bitmap bitmap) {
                                    MethodCollector.m26663i(5350);
                                    if (bitmap == null) {
                                        MethodCollector.m26664o(5350);
                                        return;
                                    }
                                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    AbstractC5877k.AbstractC5878a aVar = aVar;
                                    if (aVar != null) {
                                        aVar.mo11711a(copy, C6015e.this);
                                    }
                                    MethodCollector.m26664o(5350);
                                }
                            });
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
