package com.p2082ss.android.ugc.aweme.qasticker;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.question.EnumC66496a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qasticker.b */
public final class C65864b {

    /* renamed from: a */
    static String f148413a = "allow_show_keva_key";

    /* renamed from: b */
    public static final Keva f148414b;

    static {
        Covode.recordClassIndex(77367);
        Keva repo = Keva.getRepo("allow_show_keva_repo");
        C89219l.m154716b(repo, "");
        f148414b = repo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qasticker.b$a */
    public static final class C65865a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f148415a;

        static {
            Covode.recordClassIndex(77368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65865a(AbstractC89171a aVar) {
            super(1);
            this.f148415a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.f3z, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qasticker.C65864b.C65865a.C658661 */

                /* renamed from: a */
                final /* synthetic */ C65865a f148416a;

                static {
                    Covode.recordClassIndex(77369);
                }

                {
                    this.f148416a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C65864b.f148414b.storeInt(C65864b.f148413a, EnumC66496a.FORUM_OPEN.ordinal());
                    AbstractC89171a aVar2 = this.f148416a.f148415a;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.f3y, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qasticker.C65864b.C65865a.C658672 */

                /* renamed from: a */
                final /* synthetic */ C65865a f148417a;

                static {
                    Covode.recordClassIndex(77370);
                }

                {
                    this.f148417a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC89171a aVar2 = this.f148417a.f148415a;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final int m117794a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            C89219l.m154716b(text, "");
            if (C89361p.m154923c(text, " ")) {
                obj = C89361p.m154898a(obj, new C89269g(0, obj.length() - 2)) + '-';
            }
            return new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m117795a(AbstractC89171a<C89391z> aVar, Context context, Long l) {
        String a = C69892bn.m123462a(C63244g.m114602a().mo73255A().mo93904c());
        C89219l.m154716b(a, "");
        f148413a = a;
        if (f148414b.getInt(a, EnumC66496a.FORUM_UNKNOWN.ordinal()) == EnumC66496a.FORUM_OPEN.ordinal() || !(l == null || l.longValue() == 0)) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (context != null) {
            C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(context).mo37482a(false).mo37479a(R.string.f41).mo37483b(R.string.f40), new C65865a(aVar)).mo37405a().mo37396b().show();
        }
    }
}
