package com.p2082ss.android.ugc.aweme.shortvideo;

import androidx.core.p033d.C0646a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73914o;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.C74119n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.j */
public abstract class AbstractC71893j {

    /* renamed from: a */
    protected int f161075a;

    /* renamed from: b */
    protected int f161076b;

    /* renamed from: c */
    public int f161077c = -1;

    /* renamed from: d */
    public String f161078d;

    /* renamed from: e */
    public boolean f161079e;

    /* renamed from: f */
    private final AbstractC74096a f161080f = new C74119n();

    static {
        Covode.recordClassIndex(84442);
    }

    /* renamed from: a */
    public abstract AbstractFutureC27655q<? extends C69831ai> mo113544a(Object obj, C65616g gVar, SynthetiseResult synthetiseResult);

    /* renamed from: a */
    public abstract C65512a<SynthetiseResult> mo113545a(Object obj);

    /* renamed from: a */
    public abstract C65512a<C65616g> mo113546a(Object obj, C65616g gVar);

    /* renamed from: a */
    public abstract void mo113547a();

    /* renamed from: a */
    public void mo113548a(C0646a aVar) {
    }

    /* renamed from: a */
    public abstract void mo113549a(C73914o oVar);

    /* renamed from: b */
    public long mo113550b() {
        return -1;
    }

    /* renamed from: b */
    public abstract void mo113553b(C73914o oVar);

    /* renamed from: c */
    public long mo113554c() {
        return -1;
    }

    /* renamed from: c */
    public abstract AbstractFutureC27655q<C65616g> mo113555c(Object obj);

    /* renamed from: d */
    public long mo113556d() {
        return -1;
    }

    /* renamed from: d */
    public abstract long mo113557d(Object obj);

    /* renamed from: e */
    public boolean mo113558e(Object obj) {
        return false;
    }

    /* renamed from: b */
    public C65512a<SynthetiseResult> mo113551b(Object obj) {
        return mo113545a(obj);
    }

    public AbstractC71893j(int i, int i2) {
        this.f161075a = i;
        this.f161076b = i2;
    }

    /* renamed from: b */
    public final C65512a<C65616g> mo113552b(Object obj, C65616g gVar) {
        boolean z;
        Class<?> cls;
        String str;
        C65611c cVar;
        C65612d dVar;
        AbstractC74096a aVar = this.f161080f;
        String str2 = this.f161078d;
        boolean z2 = this.f161079e;
        C89219l.m154721d(str2, "");
        AbstractC74096a.C74099c cVar2 = new AbstractC74096a.C74099c(str2, z2);
        AbstractC74096a.C74100d dVar2 = new AbstractC74096a.C74100d(obj, cVar2);
        AbstractC74096a.C74101e eVar = new AbstractC74096a.C74101e(obj, cVar2);
        if (obj == null || ((obj instanceof VideoPublishEditModel) && !((VideoPublishEditModel) obj).getCoverPublishModel().getEffectTextModel().isCoverTextValid())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("cover_text", "skip, will NOT upload cover text image.");
            return AbstractC74096a.m130309a(gVar);
        }
        String str3 = null;
        if (obj instanceof VideoPublishEditModel) {
            CoverPublishModel coverPublishModel = ((VideoPublishEditModel) obj).getCoverPublishModel();
            C89219l.m154716b(coverPublishModel, "");
            StickerItemModel textSticker = coverPublishModel.getEffectTextModel().getTextSticker();
            if (textSticker == null || (str = textSticker.path) == null || str.length() == 0) {
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("cover_text", "skip because empty file path, will NOT upload cover text image.");
                return AbstractC74096a.m130309a(gVar);
            }
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("cover_text", "ready to upload cover text image, file path=".concat(String.valueOf(str)));
            if (!(gVar instanceof C65611c) || ((dVar = (cVar = (C65611c) gVar).f147853c) == null && (dVar = cVar.f147854d) == null)) {
                return AbstractC74096a.m130309a(gVar);
            }
            return new AbstractC74096a.C74102f(aVar, gVar, eVar, str, obj, dVar2, dVar);
        }
        StringBuilder sb = new StringBuilder("unsupported argument type, expected: (VideoPublishEditModel or PhotoMovieContext), actual: (");
        if (!(obj == null || (cls = obj.getClass()) == null)) {
            str3 = cls.getSimpleName();
        }
        throw new IllegalArgumentException(sb.append(str3).append(')').toString());
    }
}
