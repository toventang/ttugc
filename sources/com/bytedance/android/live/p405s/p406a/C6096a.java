package com.bytedance.android.live.p405s.p406a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.C9545bb;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.s.a.a */
public final class C6096a {

    /* renamed from: h */
    public static final C6097a f15230h = new C6097a((byte) 0);

    /* renamed from: a */
    public final long f15231a;

    /* renamed from: b */
    public final String f15232b;

    /* renamed from: c */
    public final String f15233c;

    /* renamed from: d */
    public final String f15234d;

    /* renamed from: e */
    public final ImageModel f15235e;

    /* renamed from: f */
    public final C9545bb f15236f;

    /* renamed from: g */
    public boolean f15237g;

    static {
        Covode.recordClassIndex(6713);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6096a)) {
            return false;
        }
        C6096a aVar = (C6096a) obj;
        return this.f15231a == aVar.f15231a && C89219l.m154714a(this.f15232b, aVar.f15232b) && C89219l.m154714a(this.f15233c, aVar.f15233c) && C89219l.m154714a(this.f15234d, aVar.f15234d) && C89219l.m154714a(this.f15235e, aVar.f15235e) && C89219l.m154714a(this.f15236f, aVar.f15236f) && this.f15237g == aVar.f15237g;
    }

    public final String toString() {
        return "AdminUser(id=" + this.f15231a + ", secUid=" + this.f15232b + ", nickName=" + this.f15233c + ", displayId=" + this.f15234d + ", avatar=" + this.f15235e + ", userHonor=" + this.f15236f + ", isAdmin=" + this.f15237g + ")";
    }

    /* renamed from: com.bytedance.android.live.s.a.a$a */
    public static final class C6097a {
        static {
            Covode.recordClassIndex(6714);
        }

        private C6097a() {
        }

        public /* synthetic */ C6097a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C6096a m13307a(User user) {
            boolean z;
            C89219l.m154721d(user, "");
            long id = user.getId();
            String secUid = user.getSecUid();
            C89219l.m154716b(secUid, "");
            String nickName = user.getNickName();
            String str = user.displayId;
            ImageModel avatarThumb = user.getAvatarThumb();
            C9545bb userHonor = user.getUserHonor();
            C9542az userAttr = user.getUserAttr();
            if (userAttr != null) {
                z = userAttr.f23192b;
            } else {
                z = false;
            }
            return new C6096a(id, secUid, nickName, str, avatarThumb, userHonor, z);
        }
    }

    private /* synthetic */ C6096a() {
        this(0, "", null, null, null, null, false);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f15231a;
        int i5 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f15232b;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        String str2 = this.f15233c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f15234d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        ImageModel imageModel = this.f15235e;
        if (imageModel != null) {
            i4 = imageModel.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        C9545bb bbVar = this.f15236f;
        if (bbVar != null) {
            i6 = bbVar.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        boolean z = this.f15237g;
        if (z) {
            z = true;
        }
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        return i11 + i12;
    }

    public C6096a(long j, String str, String str2, String str3, ImageModel imageModel, C9545bb bbVar, boolean z) {
        C89219l.m154721d(str, "");
        this.f15231a = j;
        this.f15232b = str;
        this.f15233c = str2;
        this.f15234d = str3;
        this.f15235e = imageModel;
        this.f15236f = bbVar;
        this.f15237g = z;
    }
}
