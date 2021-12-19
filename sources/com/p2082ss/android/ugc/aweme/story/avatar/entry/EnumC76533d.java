package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79476b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d */
public abstract class EnumC76533d extends Enum<EnumC76533d> {
    public static final EnumC76533d FEED;
    public static final EnumC76533d FOLLOW_LIST;
    public static final EnumC76533d INBOX;
    public static final EnumC76533d PROFILE;
    public static final EnumC76533d WESTWINDOW;

    /* renamed from: a */
    private static final /* synthetic */ EnumC76533d[] f171846a;

    /* renamed from: b */
    private final boolean f171847b;

    /* renamed from: c */
    private final EnumC79476b f171848c;

    /* renamed from: d */
    private final float f171849d;

    static {
        Covode.recordClassIndex(89518);
        C76538e eVar = new C76538e("WESTWINDOW");
        WESTWINDOW = eVar;
        C76534a aVar = new C76534a("FEED");
        FEED = aVar;
        C76536c cVar = new C76536c("INBOX");
        INBOX = cVar;
        C76537d dVar = new C76537d("PROFILE");
        PROFILE = dVar;
        C76535b bVar = new C76535b("FOLLOW_LIST");
        FOLLOW_LIST = bVar;
        f171846a = new EnumC76533d[]{eVar, aVar, cVar, dVar, bVar};
    }

    public static EnumC76533d valueOf(String str) {
        return (EnumC76533d) Enum.valueOf(EnumC76533d.class, str);
    }

    public static EnumC76533d[] values() {
        return (EnumC76533d[]) f171846a.clone();
    }

    public abstract void onEnterPlayer(SmartRoute smartRoute);

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$c */
    static final class C76536c extends EnumC76533d {

        /* renamed from: a */
        private final float f171850a;

        static {
            Covode.recordClassIndex(89521);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final float getRingWidth() {
            return this.f171850a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76536c(String str) {
            super(str, 2, null);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f171850a = TypedValue.applyDimension(1, 2.5f, system.getDisplayMetrics());
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            C89219l.m154721d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$d */
    static final class C76537d extends EnumC76533d {

        /* renamed from: a */
        private final boolean f171851a = true;

        static {
            Covode.recordClassIndex(89522);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final boolean getMayShowPublishProgress() {
            return this.f171851a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76537d(String str) {
            super(str, 3, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            C89219l.m154721d(smartRoute, "");
            smartRoute.withParam("story type", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$e */
    static final class C76538e extends EnumC76533d {

        /* renamed from: a */
        private final boolean f171852a = true;

        /* renamed from: b */
        private final EnumC79476b f171853b = EnumC79476b.CONST;

        static {
            Covode.recordClassIndex(89523);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final boolean getMayShowPublishProgress() {
            return this.f171852a;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final EnumC79476b getThemeType() {
            return this.f171853b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76538e(String str) {
            super(str, 0, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            C89219l.m154721d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_SIDE_BAR").withParam("enter_from", "westwindow").withParam("previous_page", "westwindow");
        }
    }

    public boolean getMayShowPublishProgress() {
        return this.f171847b;
    }

    public float getRingWidth() {
        return this.f171849d;
    }

    public EnumC79476b getThemeType() {
        return this.f171848c;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$a */
    static final class C76534a extends EnumC76533d {
        static {
            Covode.recordClassIndex(89519);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76534a(String str) {
            super(str, 1, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            C89219l.m154721d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$b */
    static final class C76535b extends EnumC76533d {
        static {
            Covode.recordClassIndex(89520);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76535b(String str) {
            super(str, 4, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.EnumC76533d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            C89219l.m154721d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    private EnumC76533d(String str, int i) {
        this.f171848c = EnumC79476b.LIGHT;
    }

    public /* synthetic */ EnumC76533d(String str, int i, C89214g gVar) {
        this(str, i);
    }
}
