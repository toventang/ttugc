package com.p2082ss.android.ugc.aweme.sticker.view.p4013a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m */
public abstract class AbstractC76128m {
    static {
        Covode.recordClassIndex(89076);
    }

    private AbstractC76128m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$a */
    public static final class C76129a extends AbstractC76128m {

        /* renamed from: a */
        public static final C76129a f171030a = new C76129a();

        private C76129a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89077);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$b */
    public static final class C76130b extends AbstractC76128m {

        /* renamed from: a */
        public static final C76130b f171031a = new C76130b();

        private C76130b() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89078);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$c */
    public static final class C76131c extends AbstractC76128m {

        /* renamed from: a */
        public static final C76131c f171032a = new C76131c();

        private C76131c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89079);
        }
    }

    public /* synthetic */ AbstractC76128m(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$f */
    public static final class C76134f extends AbstractC76128m {

        /* renamed from: a */
        public final View f171037a;

        static {
            Covode.recordClassIndex(89082);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C76134f) && C89219l.m154714a(this.f171037a, ((C76134f) obj).f171037a);
            }
            return true;
        }

        public final int hashCode() {
            View view = this.f171037a;
            if (view != null) {
                return view.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ViewCreated(stickerView=" + this.f171037a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76134f(View view) {
            super((byte) 0);
            C89219l.m154721d(view, "");
            this.f171037a = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$d */
    public static final class C76132d extends AbstractC76128m {

        /* renamed from: a */
        public final EffectCategoryModel f171033a;

        /* renamed from: b */
        public final int f171034b;

        static {
            Covode.recordClassIndex(89080);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76132d)) {
                return false;
            }
            C76132d dVar = (C76132d) obj;
            return C89219l.m154714a(this.f171033a, dVar.f171033a) && this.f171034b == dVar.f171034b;
        }

        public final int hashCode() {
            EffectCategoryModel effectCategoryModel = this.f171033a;
            return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.f171034b;
        }

        public final String toString() {
            return "TabChanged(tab=" + this.f171033a + ", index=" + this.f171034b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76132d(EffectCategoryModel effectCategoryModel, int i) {
            super((byte) 0);
            C89219l.m154721d(effectCategoryModel, "");
            this.f171033a = effectCategoryModel;
            this.f171034b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.m$e */
    public static final class C76133e extends AbstractC76128m {

        /* renamed from: a */
        public final EffectCategoryModel f171035a;

        /* renamed from: b */
        public final int f171036b;

        static {
            Covode.recordClassIndex(89081);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76133e)) {
                return false;
            }
            C76133e eVar = (C76133e) obj;
            return C89219l.m154714a(this.f171035a, eVar.f171035a) && this.f171036b == eVar.f171036b;
        }

        public final int hashCode() {
            EffectCategoryModel effectCategoryModel = this.f171035a;
            return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.f171036b;
        }

        public final String toString() {
            return "TabClick(tab=" + this.f171035a + ", index=" + this.f171036b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76133e(EffectCategoryModel effectCategoryModel, int i) {
            super((byte) 0);
            C89219l.m154721d(effectCategoryModel, "");
            this.f171035a = effectCategoryModel;
            this.f171036b = i;
        }
    }
}
