package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.e */
public class C9585e implements AbstractC9917y {
    @AbstractC27891c(mo46611a = "level")

    /* renamed from: a */
    public int f23223a;
    @AbstractC27891c(mo46611a = "experience")

    /* renamed from: b */
    public long f23224b;
    @AbstractC27891c(mo46611a = "lowest_experience_this_level")

    /* renamed from: c */
    public long f23225c;
    @AbstractC27891c(mo46611a = "highest_experience_this_level")

    /* renamed from: d */
    public long f23226d;
    @AbstractC27891c(mo46611a = "task_start_experience")

    /* renamed from: e */
    public long f23227e;
    @AbstractC27891c(mo46611a = "task_start_time")

    /* renamed from: f */
    public long f23228f;
    @AbstractC27891c(mo46611a = "task_decrease_experience")

    /* renamed from: g */
    public long f23229g;
    @AbstractC27891c(mo46611a = "task_target_experience")

    /* renamed from: h */
    public long f23230h;
    @AbstractC27891c(mo46611a = "task_end_time")

    /* renamed from: i */
    public long f23231i;
    @AbstractC27891c(mo46611a = "profile_dialog_bg")

    /* renamed from: j */
    public ImageModel f23232j;
    @AbstractC27891c(mo46611a = "profile_dialog_bg_back")

    /* renamed from: k */
    public ImageModel f23233k;
    @AbstractC27891c(mo46611a = "stage_level")

    /* renamed from: l */
    public ImageModel f23234l;
    @AbstractC27891c(mo46611a = "small_icon")

    /* renamed from: m */
    public ImageModel f23235m;

    static {
        Covode.recordClassIndex(11124);
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: a */
    public final int mo16531a() {
        return this.f23223a;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: b */
    public final long mo16532b() {
        return this.f23224b;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: c */
    public final long mo16533c() {
        return this.f23225c;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: d */
    public final long mo16534d() {
        return this.f23226d;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: e */
    public final long mo16535e() {
        return this.f23227e;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: f */
    public final long mo16537f() {
        return this.f23228f;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: g */
    public final long mo16538g() {
        return this.f23229g;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: h */
    public final long mo16539h() {
        return this.f23230h;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: i */
    public final long mo16541i() {
        return this.f23231i;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: j */
    public final ImageModel mo16542j() {
        return this.f23232j;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: k */
    public final ImageModel mo16543k() {
        return this.f23233k;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: l */
    public final ImageModel mo16544l() {
        return this.f23234l;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9917y
    /* renamed from: m */
    public final ImageModel mo16545m() {
        return this.f23235m;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        ImageModel imageModel = this.f23235m;
        int i5 = 0;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        long j = this.f23224b;
        long j2 = this.f23225c;
        long j3 = this.f23226d;
        long j4 = this.f23227e;
        long j5 = this.f23228f;
        long j6 = this.f23229g;
        long j7 = this.f23230h;
        long j8 = this.f23231i;
        int i6 = ((((((((((((((((((i * 31) + this.f23223a) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        ImageModel imageModel2 = this.f23232j;
        if (imageModel2 != null) {
            i2 = imageModel2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        ImageModel imageModel3 = this.f23233k;
        if (imageModel3 != null) {
            i3 = imageModel3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ImageModel imageModel4 = this.f23234l;
        if (imageModel4 != null) {
            i4 = imageModel4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        ImageModel imageModel5 = this.f23235m;
        if (imageModel5 != null) {
            i5 = imageModel5.hashCode();
        }
        return i9 + i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9585e eVar = (C9585e) obj;
            if (this.f23223a != eVar.f23223a || this.f23224b != eVar.f23224b || this.f23225c != eVar.f23225c || this.f23226d != eVar.f23226d || this.f23227e != eVar.f23227e || this.f23228f != eVar.f23228f || this.f23229g != eVar.f23229g || this.f23230h != eVar.f23230h || this.f23231i != eVar.f23231i) {
                return false;
            }
            ImageModel imageModel = this.f23232j;
            if (imageModel == null ? eVar.f23232j != null : !imageModel.equals(eVar.f23232j)) {
                return false;
            }
            ImageModel imageModel2 = this.f23233k;
            if (imageModel2 == null ? eVar.f23233k != null : !imageModel2.equals(eVar.f23233k)) {
                return false;
            }
            ImageModel imageModel3 = this.f23234l;
            if (imageModel3 == null ? eVar.f23234l != null : !imageModel3.equals(eVar.f23234l)) {
                return false;
            }
            ImageModel imageModel4 = this.f23235m;
            ImageModel imageModel5 = eVar.f23235m;
            if (imageModel4 != null) {
                return imageModel4.equals(imageModel5);
            }
            if (imageModel5 == null) {
                return true;
            }
        }
        return false;
    }
}
