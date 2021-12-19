package com.p2082ss.android.ugc.aweme.commercialize.p2566g;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.AbstractC24203d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g.c */
public final class C38005c<INFO> implements AbstractC24203d<INFO> {

    /* renamed from: a */
    private final AbstractC24203d<INFO>[] f89813a;

    static {
        Covode.recordClassIndex(45466);
    }

    public C38005c(AbstractC24203d<INFO>... dVarArr) {
        C89219l.m154721d(dVarArr, "");
        this.f89813a = dVarArr;
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onRelease(String str) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onFailure(String str, Throwable th) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onIntermediateImageFailed(String str, Throwable th) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onIntermediateImageSet(String str, INFO info) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onSubmit(String str, Object obj) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onFinalImageSet(String str, INFO info, Animatable animatable) {
        AbstractC24203d<INFO>[] dVarArr = this.f89813a;
        if (dVarArr != null) {
            for (AbstractC24203d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            }
        }
    }
}
