package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k */
public final class C75126k extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public C75129c f168904a;

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$b */
    public static final class C75128b {
        @AbstractC27891c(mo46611a = "daily_read_time_count_auto")

        /* renamed from: a */
        public C75127a f168907a;
        @AbstractC27891c(mo46611a = "required_time")

        /* renamed from: b */
        public int f168908b;

        static {
            Covode.recordClassIndex(88001);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75128b)) {
                return false;
            }
            C75128b bVar = (C75128b) obj;
            return C89219l.m154714a(this.f168907a, bVar.f168907a) && this.f168908b == bVar.f168908b;
        }

        public final int hashCode() {
            C75127a aVar = this.f168907a;
            return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f168908b;
        }

        public final String toString() {
            return "CollieExtra(autoCountTime=" + this.f168907a + ", requiredTime=" + this.f168908b + ")";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$j */
    public static final class C75136j {
        @AbstractC27891c(mo46611a = "total")

        /* renamed from: a */
        public List<C75135i> f168947a;

        static {
            Covode.recordClassIndex(88009);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75136j) && C89219l.m154714a(this.f168947a, ((C75136j) obj).f168947a);
            }
            return true;
        }

        public final int hashCode() {
            List<C75135i> list = this.f168947a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "TaskList(total=" + this.f168947a + ")";
        }
    }

    static {
        Covode.recordClassIndex(87999);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$a */
    public static final class C75127a {
        @AbstractC27891c(mo46611a = "is_auto")

        /* renamed from: a */
        public Boolean f168905a;
        @AbstractC27891c(mo46611a = "stop_auto_after_n_day_without_interaction")

        /* renamed from: b */
        public int f168906b;

        static {
            Covode.recordClassIndex(88000);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75127a)) {
                return false;
            }
            C75127a aVar = (C75127a) obj;
            return C89219l.m154714a(this.f168905a, aVar.f168905a) && this.f168906b == aVar.f168906b;
        }

        public final int hashCode() {
            Boolean bool = this.f168905a;
            return ((bool != null ? bool.hashCode() : 0) * 31) + this.f168906b;
        }

        public final String toString() {
            return "AutoCountTime(isAuto=" + this.f168905a + ", nDays=" + this.f168906b + ")";
        }

        private /* synthetic */ C75127a() {
            this(false);
        }

        private C75127a(Boolean bool) {
            this.f168905a = bool;
            this.f168906b = 5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$d */
    public static final class C75130d {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public String f168920a = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: b */
        public int f168921b = 3;
        @AbstractC27891c(mo46611a = "total_times")

        /* renamed from: c */
        public int f168922c = 3;
        @AbstractC27891c(mo46611a = "show_interval")

        /* renamed from: d */
        public int f168923d = 2;

        static {
            Covode.recordClassIndex(88003);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75130d)) {
                return false;
            }
            C75130d dVar = (C75130d) obj;
            return C89219l.m154714a(this.f168920a, dVar.f168920a) && this.f168921b == dVar.f168921b && this.f168922c == dVar.f168922c && this.f168923d == dVar.f168923d;
        }

        public final int hashCode() {
            String str = this.f168920a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f168921b) * 31) + this.f168922c) * 31) + this.f168923d;
        }

        public final String toString() {
            return "NewUserStaticBubble(content=" + this.f168920a + ", showTimeVv=" + this.f168921b + ", totalTimes=" + this.f168922c + ", showInterval=" + this.f168923d + ")";
        }

        private C75130d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$f */
    public static final class C75132f {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public String f168929a = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: b */
        public int f168930b = 3;
        @AbstractC27891c(mo46611a = "show_again_time_x")

        /* renamed from: c */
        public int f168931c = 3;
        @AbstractC27891c(mo46611a = "show_again_time_y")

        /* renamed from: d */
        public int f168932d = 10;

        static {
            Covode.recordClassIndex(88005);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75132f)) {
                return false;
            }
            C75132f fVar = (C75132f) obj;
            return C89219l.m154714a(this.f168929a, fVar.f168929a) && this.f168930b == fVar.f168930b && this.f168931c == fVar.f168931c && this.f168932d == fVar.f168932d;
        }

        public final int hashCode() {
            String str = this.f168929a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f168930b) * 31) + this.f168931c) * 31) + this.f168932d;
        }

        public final String toString() {
            return "PendantClickTipBubble(content=" + this.f168929a + ", showTimeVv=" + this.f168930b + ", showAgainTimeX=" + this.f168931c + ", showAgainTimeY=" + this.f168932d + ")";
        }

        private C75132f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$g */
    public static final class C75133g {
        @AbstractC27891c(mo46611a = "bubble_id")

        /* renamed from: a */
        public String f168933a = null;
        @AbstractC27891c(mo46611a = "long_bubble_content")

        /* renamed from: b */
        public String f168934b = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: c */
        public int f168935c = 3;
        @AbstractC27891c(mo46611a = "show_again_time")

        /* renamed from: d */
        public int f168936d = 3;

        static {
            Covode.recordClassIndex(88006);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75133g)) {
                return false;
            }
            C75133g gVar = (C75133g) obj;
            return C89219l.m154714a(this.f168933a, gVar.f168933a) && C89219l.m154714a(this.f168934b, gVar.f168934b) && this.f168935c == gVar.f168935c && this.f168936d == gVar.f168936d;
        }

        public final int hashCode() {
            String str = this.f168933a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f168934b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + this.f168935c) * 31) + this.f168936d;
        }

        public final String toString() {
            return "StaticPendantLongBubble(bubbleId=" + this.f168933a + ", longBubbleContent=" + this.f168934b + ", showTimeVv=" + this.f168935c + ", showAgainTime=" + this.f168936d + ")";
        }

        private C75133g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$h */
    public static final class C75134h {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public String f168937a = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: b */
        public int f168938b = 3;
        @AbstractC27891c(mo46611a = "show_again_time_x")

        /* renamed from: c */
        public int f168939c = 3;
        @AbstractC27891c(mo46611a = "show_again_time_y")

        /* renamed from: d */
        public int f168940d = 10;

        static {
            Covode.recordClassIndex(88007);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75134h)) {
                return false;
            }
            C75134h hVar = (C75134h) obj;
            return C89219l.m154714a(this.f168937a, hVar.f168937a) && this.f168938b == hVar.f168938b && this.f168939c == hVar.f168939c && this.f168940d == hVar.f168940d;
        }

        public final int hashCode() {
            String str = this.f168937a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f168938b) * 31) + this.f168939c) * 31) + this.f168940d;
        }

        public final String toString() {
            return "TapRewardsTipBubble(content=" + this.f168937a + ", showTimeVv=" + this.f168938b + ", showAgainTimeX=" + this.f168939c + ", showAgainTimeY=" + this.f168940d + ")";
        }

        private C75134h() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$k */
    public static final class C75137k {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public String f168948a = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: b */
        public int f168949b = 3;
        @AbstractC27891c(mo46611a = "total_times")

        /* renamed from: c */
        public int f168950c = 3;
        @AbstractC27891c(mo46611a = "show_interval")

        /* renamed from: d */
        public int f168951d = 2;

        static {
            Covode.recordClassIndex(88010);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75137k)) {
                return false;
            }
            C75137k kVar = (C75137k) obj;
            return C89219l.m154714a(this.f168948a, kVar.f168948a) && this.f168949b == kVar.f168949b && this.f168950c == kVar.f168950c && this.f168951d == kVar.f168951d;
        }

        public final int hashCode() {
            String str = this.f168948a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f168949b) * 31) + this.f168950c) * 31) + this.f168951d;
        }

        public final String toString() {
            return "VideoTaskPromptBubble(content=" + this.f168948a + ", showTimeVv=" + this.f168949b + ", totalTimes=" + this.f168950c + ", showInterval=" + this.f168951d + ")";
        }

        private C75137k() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$e */
    public static final class C75131e {
        @AbstractC27891c(mo46611a = "bubble_id")

        /* renamed from: a */
        public String f168924a = null;
        @AbstractC27891c(mo46611a = "long_bubble_content")

        /* renamed from: b */
        public String f168925b = null;
        @AbstractC27891c(mo46611a = "short_bubble_content")

        /* renamed from: c */
        public String f168926c = null;
        @AbstractC27891c(mo46611a = "show_time_vv")

        /* renamed from: d */
        public int f168927d = 5;
        @AbstractC27891c(mo46611a = "show_again_time")

        /* renamed from: e */
        public int f168928e = 3;

        static {
            Covode.recordClassIndex(88004);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75131e)) {
                return false;
            }
            C75131e eVar = (C75131e) obj;
            return C89219l.m154714a(this.f168924a, eVar.f168924a) && C89219l.m154714a(this.f168925b, eVar.f168925b) && C89219l.m154714a(this.f168926c, eVar.f168926c) && this.f168927d == eVar.f168927d && this.f168928e == eVar.f168928e;
        }

        public final int hashCode() {
            String str = this.f168924a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f168925b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f168926c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((((hashCode2 + i) * 31) + this.f168927d) * 31) + this.f168928e;
        }

        public final String toString() {
            return "PendantBubble(bubbleId=" + this.f168924a + ", longBubbleContent=" + this.f168925b + ", shortBubbleContent=" + this.f168926c + ", showTimeVv=" + this.f168927d + ", showAgainTime=" + this.f168928e + ")";
        }

        private C75131e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$i */
    public static final class C75135i {
        @AbstractC27891c(mo46611a = "app_id")

        /* renamed from: a */
        public long f168941a;
        @AbstractC27891c(mo46611a = "task_id")

        /* renamed from: b */
        public int f168942b;
        @AbstractC27891c(mo46611a = "key")

        /* renamed from: c */
        public String f168943c;
        @AbstractC27891c(mo46611a = "completed")

        /* renamed from: d */
        public Boolean f168944d;
        @AbstractC27891c(mo46611a = "conf_extra")

        /* renamed from: e */
        public String f168945e;
        @AbstractC27891c(mo46611a = "collie_extra")

        /* renamed from: f */
        public C75128b f168946f;

        static {
            Covode.recordClassIndex(88008);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75135i)) {
                return false;
            }
            C75135i iVar = (C75135i) obj;
            return this.f168941a == iVar.f168941a && this.f168942b == iVar.f168942b && C89219l.m154714a(this.f168943c, iVar.f168943c) && C89219l.m154714a(this.f168944d, iVar.f168944d) && C89219l.m154714a(this.f168945e, iVar.f168945e) && C89219l.m154714a(this.f168946f, iVar.f168946f);
        }

        public final String toString() {
            return "Task(appId=" + this.f168941a + ", taskId=" + this.f168942b + ", key=" + this.f168943c + ", completed=" + this.f168944d + ", extra=" + this.f168945e + ", collieExtra=" + this.f168946f + ")";
        }

        /* renamed from: a */
        public final int mo118292a() {
            if (!TextUtils.isEmpty(this.f168945e)) {
                try {
                    return new JSONObject(this.f168945e).optInt("cold_down", 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return 0;
        }

        /* renamed from: b */
        public final int mo118293b() {
            if (!TextUtils.isEmpty(this.f168945e)) {
                try {
                    return new JSONObject(this.f168945e).optInt("read_and_like_video_time", 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return 0;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            long j = this.f168941a;
            int i4 = ((((int) (j ^ (j >>> 32))) * 31) + this.f168942b) * 31;
            String str = this.f168943c;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            Boolean bool = this.f168944d;
            if (bool != null) {
                i2 = bool.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str2 = this.f168945e;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            C75128b bVar = this.f168946f;
            if (bVar != null) {
                i5 = bVar.hashCode();
            }
            return i8 + i5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$c */
    public static final class C75129c {
        @AbstractC27891c(mo46611a = "task_list")

        /* renamed from: a */
        public C75136j f168909a;
        @AbstractC27891c(mo46611a = "popup_list")

        /* renamed from: b */
        public List<C75124i> f168910b;
        @AbstractC27891c(mo46611a = "popup_to_display")

        /* renamed from: c */
        public C75124i f168911c;
        @AbstractC27891c(mo46611a = "pendant_bubble")

        /* renamed from: d */
        public C75131e f168912d;
        @AbstractC27891c(mo46611a = "pendant_click_tip_bubble")

        /* renamed from: e */
        public C75132f f168913e;
        @AbstractC27891c(mo46611a = "static_pendant_bubble")

        /* renamed from: f */
        public C75133g f168914f;
        @AbstractC27891c(mo46611a = "last_activation_time")

        /* renamed from: g */
        public long f168915g;
        @AbstractC27891c(mo46611a = "lottie_name")

        /* renamed from: h */
        public String f168916h;
        @AbstractC27891c(mo46611a = "tap_to_rewards_bubble")

        /* renamed from: i */
        public C75134h f168917i;
        @AbstractC27891c(mo46611a = "new_user_static_bubble")

        /* renamed from: j */
        public C75130d f168918j;
        @AbstractC27891c(mo46611a = "video_task_prompt_bubble")

        /* renamed from: k */
        public C75137k f168919k;

        static {
            Covode.recordClassIndex(88002);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75129c)) {
                return false;
            }
            C75129c cVar = (C75129c) obj;
            return C89219l.m154714a(this.f168909a, cVar.f168909a) && C89219l.m154714a(this.f168910b, cVar.f168910b) && C89219l.m154714a(this.f168911c, cVar.f168911c) && C89219l.m154714a(this.f168912d, cVar.f168912d) && C89219l.m154714a(this.f168913e, cVar.f168913e) && C89219l.m154714a(this.f168914f, cVar.f168914f) && this.f168915g == cVar.f168915g && C89219l.m154714a(this.f168916h, cVar.f168916h) && C89219l.m154714a(this.f168917i, cVar.f168917i) && C89219l.m154714a(this.f168918j, cVar.f168918j) && C89219l.m154714a(this.f168919k, cVar.f168919k);
        }

        public final String toString() {
            return "Data(taskList=" + this.f168909a + ", popupList=" + this.f168910b + ", popup=" + this.f168911c + ", pendantBubble=" + this.f168912d + ", pendantClickTipBubble=" + this.f168913e + ", staticPendantLongBubble=" + this.f168914f + ", lastActivationTime=" + this.f168915g + ", lottieName=" + this.f168916h + ", tapRewardsTipBubble=" + this.f168917i + ", newUserStaticBubble=" + this.f168918j + ", videoTaskPromptBubble=" + this.f168919k + ")";
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            C75136j jVar = this.f168909a;
            int i10 = 0;
            if (jVar != null) {
                i = jVar.hashCode();
            } else {
                i = 0;
            }
            int i11 = i * 31;
            List<C75124i> list = this.f168910b;
            if (list != null) {
                i2 = list.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 31;
            C75124i iVar = this.f168911c;
            if (iVar != null) {
                i3 = iVar.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 31;
            C75131e eVar = this.f168912d;
            if (eVar != null) {
                i4 = eVar.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 31;
            C75132f fVar = this.f168913e;
            if (fVar != null) {
                i5 = fVar.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 31;
            C75133g gVar = this.f168914f;
            if (gVar != null) {
                i6 = gVar.hashCode();
            } else {
                i6 = 0;
            }
            long j = this.f168915g;
            int i16 = (((i15 + i6) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str = this.f168916h;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 31;
            C75134h hVar = this.f168917i;
            if (hVar != null) {
                i8 = hVar.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 31;
            C75130d dVar = this.f168918j;
            if (dVar != null) {
                i9 = dVar.hashCode();
            } else {
                i9 = 0;
            }
            int i19 = (i18 + i9) * 31;
            C75137k kVar = this.f168919k;
            if (kVar != null) {
                i10 = kVar.hashCode();
            }
            return i19 + i10;
        }
    }
}
