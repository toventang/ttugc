package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72353d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.c */
public final class C72303c {

    /* renamed from: a */
    public static final Property<C72353d, float[]> f162100a = new Property<C72353d, float[]>(float[].class, "nonTranslations") {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72303c.C723041 */

        static {
            Covode.recordClassIndex(84971);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(C72353d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C72353d dVar, float[] fArr) {
            C72353d dVar2 = dVar;
            float[] fArr2 = fArr;
            C89219l.m154721d(fArr2, "");
            System.arraycopy(fArr2, 0, dVar2.f162194a, 0, fArr2.length);
            dVar2.mo114636a();
        }
    };

    /* renamed from: b */
    public static final Property<C72353d, PointF> f162101b = new Property<C72353d, PointF>(PointF.class, "translations") {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72303c.C723052 */

        static {
            Covode.recordClassIndex(84972);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C72353d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C72353d dVar, PointF pointF) {
            C72353d dVar2 = dVar;
            PointF pointF2 = pointF;
            C89219l.m154721d(pointF2, "");
            dVar2.f162195b = pointF2.x;
            dVar2.f162196c = pointF2.y;
            dVar2.mo114636a();
        }
    };

    static {
        Covode.recordClassIndex(84970);
    }
}
