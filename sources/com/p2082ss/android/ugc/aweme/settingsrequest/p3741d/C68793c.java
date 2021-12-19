package com.p2082ss.android.ugc.aweme.settingsrequest.p3741d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c */
public final class C68793c extends BaseResponse {
    @AbstractC27891c(mo46611a = "show_time")

    /* renamed from: a */
    public int f153851a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public int f153852b;
    @AbstractC27891c(mo46611a = "popupBatch")

    /* renamed from: c */
    public int f153853c;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: d */
    public C68796c f153854d;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: e */
    public String f153855e;
    @AbstractC27891c(mo46611a = "show_interval")

    /* renamed from: f */
    public int f153856f;

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$a */
    public static class C68794a {
        @AbstractC27891c(mo46611a = "action_type")

        /* renamed from: a */
        public int f153857a;
        @AbstractC27891c(mo46611a = "target")

        /* renamed from: b */
        public String f153858b;

        static {
            Covode.recordClassIndex(81071);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$b */
    public static class C68795b {
        @AbstractC27891c(mo46611a = "text")

        /* renamed from: a */
        public String f153859a;
        @AbstractC27891c(mo46611a = "style")

        /* renamed from: b */
        public EnumC68797d f153860b;
        @AbstractC27891c(mo46611a = "action")

        /* renamed from: c */
        public C68794a f153861c;

        static {
            Covode.recordClassIndex(81072);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$c */
    public static class C68796c {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        public String f153862a;
        @AbstractC27891c(mo46611a = "context")

        /* renamed from: b */
        public String f153863b;
        @AbstractC27891c(mo46611a = "buttons")

        /* renamed from: c */
        public List<C68795b> f153864c;
        @AbstractC27891c(mo46611a = "labels")

        /* renamed from: d */
        public List<C68795b> f153865d;
        @AbstractC27891c(mo46611a = "image")

        /* renamed from: e */
        public C68798e f153866e;

        static {
            Covode.recordClassIndex(81073);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$e */
    public static class C68798e {
        @AbstractC27891c(mo46611a = "uri")

        /* renamed from: a */
        public String f153869a;
        @AbstractC27891c(mo46611a = "url_list")

        /* renamed from: b */
        public String[] f153870b;
        @AbstractC27891c(mo46611a = "width")

        /* renamed from: c */
        public int f153871c;
        @AbstractC27891c(mo46611a = "height")

        /* renamed from: d */
        public int f153872d;
        @AbstractC27891c(mo46611a = "url_key")

        /* renamed from: e */
        public String f153873e;

        static {
            Covode.recordClassIndex(81075);
        }
    }

    static {
        Covode.recordClassIndex(81070);
    }

    /* renamed from: a */
    public final String mo109257a() {
        try {
            return this.f153854d.f153862a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo109258b() {
        try {
            return this.f153854d.f153863b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final String mo109259c() {
        try {
            return this.f153854d.f153864c.get(0).f153859a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final String mo109260d() {
        try {
            return this.f153854d.f153864c.get(0).f153861c.f153858b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public final String mo109261e() {
        try {
            return this.f153854d.f153864c.get(1).f153859a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public final String mo109262f() {
        try {
            return this.f153854d.f153864c.get(1).f153861c.f153858b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$d */
    public enum EnumC68797d {
        STYLE_ACTION(1),
        STYLE_NORMAL(2),
        STYLE_GREY(3);
        

        /* renamed from: a */
        private int f153868a;

        static {
            Covode.recordClassIndex(81074);
        }

        private EnumC68797d(int i) {
            this.f153868a = i;
        }
    }
}
