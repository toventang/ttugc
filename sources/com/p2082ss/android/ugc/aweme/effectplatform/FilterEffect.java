package com.p2082ss.android.ugc.aweme.effectplatform;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect */
public final class FilterEffect extends Effect implements Parcelable {
    public static final Parcelable.Creator<FilterEffect> CREATOR = new C46401b();
    public static final C46400a Companion = new C46400a((byte) 0);
    @AbstractC27891c(mo46611a = "is_checked")

    /* renamed from: a */
    private boolean f108134a;
    @AbstractC27891c(mo46611a = "is_buildin")

    /* renamed from: b */
    private boolean f108135b;

    /* renamed from: c */
    private final com.p2082ss.ugc.effectplatform.model.Effect f108136c;

    public FilterEffect() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.p2082ss.ugc.effectplatform.model.Effect
    public final int describeContents() {
        return 0;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$a */
    public static final class C46400a {
        static {
            Covode.recordClassIndex(54981);
        }

        private C46400a() {
        }

        public /* synthetic */ C46400a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$b */
    public static final class C46401b implements Parcelable.Creator<FilterEffect> {
        static {
            Covode.recordClassIndex(54982);
        }

        C46401b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FilterEffect[] newArray(int i) {
            return new FilterEffect[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FilterEffect createFromParcel(Parcel parcel) {
            return m89550a(parcel);
        }

        /* renamed from: a */
        private static FilterEffect m89550a(Parcel parcel) {
            boolean z;
            Object obj;
            C89219l.m154721d(parcel, "");
            com.p2082ss.ugc.effectplatform.model.Effect effect = null;
            try {
                Object obj2 = com.p2082ss.ugc.effectplatform.model.Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.p2082ss.ugc.effectplatform.model.Effect)) {
                    obj = null;
                }
                effect = (com.p2082ss.ugc.effectplatform.model.Effect) obj;
            } catch (Exception unused) {
            }
            FilterEffect filterEffect = new FilterEffect(effect);
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            filterEffect.setChecked(z);
            if (parcel.readByte() == 0) {
                z2 = false;
            }
            filterEffect.setBuildIn(z2);
            return filterEffect;
        }
    }

    public final boolean getBuildIn() {
        return this.f108135b;
    }

    public final boolean getChecked() {
        return this.f108134a;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.p2082ss.android.ugc.effectmanager.effect.model.Effect
    public final com.p2082ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.f108136c;
    }

    static {
        Covode.recordClassIndex(54980);
    }

    public final void setBuildIn(boolean z) {
        this.f108135b = z;
    }

    public final void setChecked(boolean z) {
        this.f108134a = z;
    }

    public FilterEffect(com.p2082ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.f108136c = effect;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.p2082ss.ugc.effectplatform.model.Effect, com.p2082ss.android.ugc.effectmanager.effect.model.Effect
    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        if (getKEffect() != null) {
            getKEffect().writeToParcel(parcel, i);
        } else {
            super.writeToParcel(parcel, i);
        }
        parcel.writeByte((byte) getInt(this.f108134a));
        parcel.writeByte((byte) getInt(this.f108134a));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterEffect(com.p2082ss.ugc.effectplatform.model.Effect effect, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effect);
    }
}
