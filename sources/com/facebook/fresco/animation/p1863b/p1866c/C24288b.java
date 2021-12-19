package com.facebook.fresco.animation.p1863b.p1866c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;
import com.facebook.fresco.animation.p1863b.AbstractC24286c;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1874c.C24342d;

/* renamed from: com.facebook.fresco.animation.b.c.b */
public class C24288b implements AbstractC24286c {

    /* renamed from: b */
    private static final Class<?> f57577b = C24288b.class;

    /* renamed from: a */
    public final AbstractC24280b f57578a;

    /* renamed from: c */
    private AbstractC24319a f57579c;

    /* renamed from: d */
    private C24342d f57580d;

    /* renamed from: e */
    private final C24342d.AbstractC24344a f57581e;

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24286c
    /* renamed from: a */
    public final int mo40063a() {
        return this.f57579c.mo40120c();
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24286c
    /* renamed from: b */
    public final int mo40066b() {
        return this.f57579c.mo40121d();
    }

    static {
        Covode.recordClassIndex(28420);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24286c
    /* renamed from: a */
    public final void mo40064a(Rect rect) {
        AbstractC24319a a = this.f57579c.mo40115a(rect);
        if (a != this.f57579c) {
            this.f57579c = a;
            this.f57580d = new C24342d(this.f57579c, this.f57581e);
        }
    }

    public C24288b(AbstractC24280b bVar, AbstractC24319a aVar) {
        C242891 r2 = new C24342d.AbstractC24344a() {
            /* class com.facebook.fresco.animation.p1863b.p1866c.C24288b.C242891 */

            static {
                Covode.recordClassIndex(28421);
            }

            @Override // com.facebook.imagepipeline.p1871a.p1874c.C24342d.AbstractC24344a
            /* renamed from: a */
            public final C24117a<Bitmap> mo40067a(int i) {
                return C24288b.this.f57578a.mo40055a(i);
            }
        };
        this.f57581e = r2;
        this.f57578a = bVar;
        this.f57579c = aVar;
        this.f57580d = new C24342d(this.f57579c, r2);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24286c
    /* renamed from: a */
    public final boolean mo40065a(int i, Bitmap bitmap) {
        try {
            this.f57580d.mo40141a(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C24099a.m45650b(f57577b, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }
}
