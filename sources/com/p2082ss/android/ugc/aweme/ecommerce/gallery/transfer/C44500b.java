package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.b */
public final class C44500b extends AbstractC44514f {
    static {
        Covode.recordClassIndex(52850);
    }

    C44500b(C44507e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.AbstractC44514f
    /* renamed from: c */
    public final C44529c mo75514c(int i) {
        C44503d transConfig = this.f103807a.getTransConfig();
        List<ImageView> a = transConfig.mo75516a();
        if (a.size() <= i || a.get(i) == null) {
            return null;
        }
        C44529c a2 = mo75547a(a.get(i));
        mo75548a(transConfig.f103755k.get(i), a2, false);
        this.f103807a.addView(a2, 1);
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.AbstractC44514f
    /* renamed from: a */
    public final C44529c mo75510a(int i) {
        C44503d transConfig = this.f103807a.getTransConfig();
        C44529c a = mo75547a(transConfig.mo75516a().get(i));
        mo75548a(transConfig.f103755k.get(i), a, true);
        this.f103807a.addView(a, 1);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.AbstractC44514f
    /* renamed from: b */
    public final void mo75513b(int i) {
        this.f103807a.getTransAdapter();
        C44503d transConfig = this.f103807a.getTransConfig();
        C44529c a = this.f103807a.getTransAdapter().mo65352a(i);
        AbstractC44487c b = transConfig.mo75517b();
        if (transConfig.f103749e) {
            m87190a(a.getDrawable(), i, a);
        } else if (b.mo75485b(transConfig.f103755k.get(i))) {
            b.mo75483a(new C44502c(this, transConfig, i, a));
        } else {
            m87190a(transConfig.mo75515a(this.f103808b), i, a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.AbstractC44514f
    /* renamed from: a */
    public final void mo75512a(C44529c cVar, int i) {
        Drawable a;
        C44503d transConfig = this.f103807a.getTransConfig();
        AbstractC44487c b = transConfig.mo75517b();
        String str = transConfig.f103755k.get(i);
        if (!b.mo75485b(str) || (a = b.mo75482a(str)) == null) {
            cVar.setImageDrawable(transConfig.mo75515a(this.f103808b));
        } else {
            cVar.setImageDrawable(a);
        }
    }

    /* renamed from: a */
    private void m87190a(Drawable drawable, int i, final C44529c cVar) {
        final C44503d transConfig = this.f103807a.getTransConfig();
        cVar.f103855i = false;
        this.f103807a.mo75523a(cVar, i);
        transConfig.mo75517b().mo75484a(transConfig.f103754j.get(i), cVar, drawable, new AbstractC44487c.AbstractC44488a() {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44500b.C445011 */

            static {
                Covode.recordClassIndex(52851);
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c.AbstractC44488a
            /* renamed from: a */
            public final void mo75486a(int i) {
                if (i == 0) {
                    cVar.setImageDrawable(transConfig.mo75515a(C44500b.this.f103808b));
                } else if (i == 1) {
                    cVar.f103855i = true;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo75511a(C44503d dVar, int i, C44529c cVar, Drawable drawable) {
        if (drawable == null) {
            drawable = dVar.mo75515a(this.f103808b);
        }
        m87190a(drawable, i, cVar);
    }
}
