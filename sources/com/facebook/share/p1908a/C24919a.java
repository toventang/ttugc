package com.facebook.share.p1908a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.AccessToken;
import com.facebook.internal.AbstractC24744h;
import com.facebook.internal.AbstractC24747j;
import com.facebook.internal.C24667a;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24739e;
import com.facebook.internal.C24745i;
import com.facebook.internal.C24784x;
import com.facebook.p1814a.C23998m;
import com.facebook.share.AbstractC24917a;
import com.facebook.share.internal.C24941c;
import com.facebook.share.internal.C24944e;
import com.facebook.share.internal.C24949i;
import com.facebook.share.internal.C24954k;
import com.facebook.share.internal.C24966m;
import com.facebook.share.internal.EnumC24935a;
import com.facebook.share.internal.EnumC24945f;
import com.facebook.share.internal.EnumC24953j;
import com.facebook.share.internal.EnumC24965l;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.share.a.a */
public final class C24919a extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a> implements AbstractC24917a {

    /* renamed from: d */
    private static final String f59160d = C24919a.class.getSimpleName();

    /* renamed from: e */
    private static final int f59161e = C24739e.EnumC24741b.Share.toRequestCode();

    /* renamed from: c */
    boolean f59162c;

    /* renamed from: f */
    private boolean f59163f = true;

    /* renamed from: com.facebook.share.a.a$a */
    class C24921a extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a {
        static {
            Covode.recordClassIndex(30222);
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final Object mo40582a() {
            return EnumC24924c.NATIVE;
        }

        private C24921a() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24667a mo40581a(final ShareContent shareContent) {
            C24949i.m47828a(shareContent);
            final C24667a c = C24919a.this.mo40580c();
            final boolean z = C24919a.this.f59162c;
            C24745i.m47377a(c, new C24745i.AbstractC24746a() {
                /* class com.facebook.share.p1908a.C24919a.C24921a.C249221 */

                static {
                    Covode.recordClassIndex(30223);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: a */
                public final Bundle mo40574a() {
                    return C24944e.m47818a(c.mo40497b(), shareContent, z);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: b */
                public final Bundle mo40575b() {
                    return C24941c.m47797a(c.mo40497b(), shareContent, z);
                }
            }, C24919a.m47755b((Class<? extends ShareContent>) shareContent.getClass()));
            return c;
        }

        /* synthetic */ C24921a(C24919a aVar, byte b) {
            this();
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final /* synthetic */ boolean mo40583a(Object obj, boolean z) {
            if (!(obj instanceof ShareCameraEffectContent) || !C24919a.m47754a((Class<? extends ShareContent>) obj.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.a.a$b */
    class C24923b extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a {
        static {
            Covode.recordClassIndex(30224);
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final Object mo40582a() {
            return EnumC24924c.FEED;
        }

        private C24923b() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24667a mo40581a(ShareContent shareContent) {
            Bundle bundle;
            C24919a aVar = C24919a.this;
            aVar.mo40802a(aVar.mo40576a(), shareContent, EnumC24924c.FEED);
            C24667a c = C24919a.this.mo40580c();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                C24949i.m47845b(shareLinkContent);
                bundle = new Bundle();
                C24693ad.m47249a(bundle, StringSet.name, shareLinkContent.f59252b);
                C24693ad.m47249a(bundle, "description", shareLinkContent.f59251a);
                C24693ad.m47249a(bundle, "link", C24693ad.m47234a(shareLinkContent.f59237h));
                C24693ad.m47249a(bundle, "picture", C24693ad.m47234a(shareLinkContent.f59253c));
                C24693ad.m47249a(bundle, "quote", shareLinkContent.f59254d);
                if (shareLinkContent.f59242m != null) {
                    C24693ad.m47249a(bundle, "hashtag", shareLinkContent.f59242m.f59249a);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                C24693ad.m47249a(bundle, "to", shareFeedContent.f59195a);
                C24693ad.m47249a(bundle, "link", shareFeedContent.f59196b);
                C24693ad.m47249a(bundle, "picture", shareFeedContent.f59200f);
                C24693ad.m47249a(bundle, "source", shareFeedContent.f59201g);
                C24693ad.m47249a(bundle, StringSet.name, shareFeedContent.f59197c);
                C24693ad.m47249a(bundle, "caption", shareFeedContent.f59198d);
                C24693ad.m47249a(bundle, "description", shareFeedContent.f59199e);
            }
            C24745i.m47379a(c, "feed", bundle);
            return c;
        }

        /* synthetic */ C24923b(C24919a aVar, byte b) {
            this();
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo40583a(Object obj, boolean z) {
            if ((obj instanceof ShareLinkContent) || (obj instanceof ShareFeedContent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.facebook.share.a.a$d */
    class C24925d extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a {
        static {
            Covode.recordClassIndex(30226);
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final Object mo40582a() {
            return EnumC24924c.NATIVE;
        }

        private C24925d() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24667a mo40581a(final ShareContent shareContent) {
            C24919a aVar = C24919a.this;
            aVar.mo40802a(aVar.mo40576a(), shareContent, EnumC24924c.NATIVE);
            C24949i.m47828a(shareContent);
            final C24667a c = C24919a.this.mo40580c();
            final boolean z = C24919a.this.f59162c;
            C24745i.m47377a(c, new C24745i.AbstractC24746a() {
                /* class com.facebook.share.p1908a.C24919a.C24925d.C249261 */

                static {
                    Covode.recordClassIndex(30227);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: a */
                public final Bundle mo40574a() {
                    return C24944e.m47818a(c.mo40497b(), shareContent, z);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: b */
                public final Bundle mo40575b() {
                    return C24941c.m47797a(c.mo40497b(), shareContent, z);
                }
            }, C24919a.m47755b((Class<? extends ShareContent>) shareContent.getClass()));
            return c;
        }

        /* synthetic */ C24925d(C24919a aVar, byte b) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            if (r1 != false) goto L_0x0033;
         */
        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ boolean mo40583a(java.lang.Object r5, boolean r6) {
            /*
                r4 = this;
                com.facebook.share.model.ShareContent r5 = (com.facebook.share.model.ShareContent) r5
                r3 = 0
                if (r5 == 0) goto L_0x000d
                boolean r0 = r5 instanceof com.facebook.share.model.ShareCameraEffectContent
                if (r0 != 0) goto L_0x000d
                boolean r0 = r5 instanceof com.facebook.share.model.ShareStoryContent
                if (r0 == 0) goto L_0x000e
            L_0x000d:
                return r3
            L_0x000e:
                r2 = 1
                if (r6 != 0) goto L_0x0033
                com.facebook.share.model.ShareHashtag r0 = r5.f59242m
                if (r0 == 0) goto L_0x003e
                com.facebook.share.internal.j r0 = com.facebook.share.internal.EnumC24953j.HASHTAG
                boolean r1 = com.facebook.internal.C24745i.m47380a(r0)
            L_0x001b:
                boolean r0 = r5 instanceof com.facebook.share.model.ShareLinkContent
                if (r0 == 0) goto L_0x0031
                r0 = r5
                com.facebook.share.model.ShareLinkContent r0 = (com.facebook.share.model.ShareLinkContent) r0
                java.lang.String r0 = r0.f59254d
                boolean r0 = com.facebook.internal.C24693ad.m47261a(r0)
                if (r0 != 0) goto L_0x0031
                com.facebook.share.internal.j r0 = com.facebook.share.internal.EnumC24953j.LINK_SHARE_QUOTES
                boolean r0 = com.facebook.internal.C24745i.m47380a(r0)
                r1 = r1 & r0
            L_0x0031:
                if (r1 == 0) goto L_0x000d
            L_0x0033:
                java.lang.Class r0 = r5.getClass()
                boolean r0 = com.facebook.share.p1908a.C24919a.m47754a(r0)
                if (r0 == 0) goto L_0x000d
                return r2
            L_0x003e:
                r1 = 1
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.p1908a.C24919a.C24925d.mo40583a(java.lang.Object, boolean):boolean");
        }
    }

    /* renamed from: com.facebook.share.a.a$e */
    class C24927e extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a {
        static {
            Covode.recordClassIndex(30228);
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final Object mo40582a() {
            return EnumC24924c.NATIVE;
        }

        private C24927e() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24667a mo40581a(final ShareContent shareContent) {
            if (C24949i.f59212a == null) {
                C24949i.f59212a = new C24949i.C24950a((byte) 0);
            }
            C24949i.m47829a(shareContent, C24949i.f59212a);
            final C24667a c = C24919a.this.mo40580c();
            final boolean z = C24919a.this.f59162c;
            C24745i.m47377a(c, new C24745i.AbstractC24746a() {
                /* class com.facebook.share.p1908a.C24919a.C24927e.C249281 */

                static {
                    Covode.recordClassIndex(30229);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: a */
                public final Bundle mo40574a() {
                    return C24944e.m47818a(c.mo40497b(), shareContent, z);
                }

                @Override // com.facebook.internal.C24745i.AbstractC24746a
                /* renamed from: b */
                public final Bundle mo40575b() {
                    return C24941c.m47797a(c.mo40497b(), shareContent, z);
                }
            }, C24919a.m47755b((Class<? extends ShareContent>) shareContent.getClass()));
            return c;
        }

        /* synthetic */ C24927e(C24919a aVar, byte b) {
            this();
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final /* synthetic */ boolean mo40583a(Object obj, boolean z) {
            if (!(obj instanceof ShareStoryContent) || !C24919a.m47754a((Class<? extends ShareContent>) obj.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.a.a$f */
    class C24929f extends AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a {
        static {
            Covode.recordClassIndex(30230);
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final Object mo40582a() {
            return EnumC24924c.WEB;
        }

        private C24929f() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24667a mo40581a(ShareContent shareContent) {
            Bundle bundle;
            C24919a aVar = C24919a.this;
            aVar.mo40802a(aVar.mo40576a(), shareContent, EnumC24924c.WEB);
            C24667a c = C24919a.this.mo40580c();
            C24949i.m47845b(shareContent);
            String str = null;
            if (shareContent instanceof ShareLinkContent) {
                bundle = C24966m.m47893a((ShareLinkContent) shareContent);
            } else {
                if (shareContent instanceof SharePhotoContent) {
                    SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
                    UUID b = c.mo40497b();
                    SharePhotoContent.C24997a a = new SharePhotoContent.C24997a().mo40835a(sharePhotoContent);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < sharePhotoContent.f59299a.size(); i++) {
                        SharePhoto sharePhoto = sharePhotoContent.f59299a.get(i);
                        Bitmap bitmap = sharePhoto.f59291b;
                        if (bitmap != null) {
                            C24784x.C24785a a2 = C24784x.m47450a(b, bitmap);
                            SharePhoto.C24995a a3 = new SharePhoto.C24995a().mo40845a(sharePhoto);
                            a3.f59296c = Uri.parse(a2.f58812b);
                            a3.f59295b = null;
                            sharePhoto = a3.mo40878a();
                            arrayList2.add(a2);
                        }
                        arrayList.add(sharePhoto);
                    }
                    a.mo40883a(arrayList);
                    C24784x.m47456a(arrayList2);
                    bundle = C24966m.m47895a(a.mo40884a());
                } else {
                    bundle = C24966m.m47894a((ShareOpenGraphContent) shareContent);
                }
                if (!(shareContent instanceof SharePhotoContent)) {
                    if (shareContent instanceof ShareOpenGraphContent) {
                        str = "share_open_graph";
                    }
                    C24745i.m47379a(c, str, bundle);
                    return c;
                }
            }
            str = "share";
            C24745i.m47379a(c, str, bundle);
            return c;
        }

        /* synthetic */ C24929f(C24919a aVar, byte b) {
            this();
        }

        @Override // com.facebook.internal.AbstractC24747j.AbstractC24748a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo40583a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent == null || !C24919a.m47753a(shareContent)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.facebook.internal.AbstractC24747j
    /* renamed from: c */
    public final C24667a mo40580c() {
        return new C24667a(this.f58718b);
    }

    static {
        Covode.recordClassIndex(30220);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.share.a.a$1 */
    public static /* synthetic */ class C249201 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59164a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 30221(0x760d, float:4.2349E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.share.a.a$c[] r0 = com.facebook.share.p1908a.C24919a.EnumC24924c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.share.p1908a.C24919a.C249201.f59164a = r2
                com.facebook.share.a.a$c r0 = com.facebook.share.p1908a.C24919a.EnumC24924c.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.share.p1908a.C24919a.C249201.f59164a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.share.a.a$c r0 = com.facebook.share.p1908a.C24919a.EnumC24924c.WEB     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.share.p1908a.C24919a.C249201.f59164a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.share.a.a$c r0 = com.facebook.share.p1908a.C24919a.EnumC24924c.NATIVE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.p1908a.C24919a.C249201.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.share.a.a$c */
    public enum EnumC24924c {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        static {
            Covode.recordClassIndex(30225);
        }
    }

    @Override // com.facebook.internal.AbstractC24747j
    /* renamed from: b */
    public final List<AbstractC24747j<ShareContent, AbstractC24917a.C24918a>.AbstractC24748a> mo40578b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C24925d(this, (byte) 0));
        arrayList.add(new C24923b(this, (byte) 0));
        arrayList.add(new C24929f(this, (byte) 0));
        arrayList.add(new C24921a(this, (byte) 0));
        arrayList.add(new C24927e(this, (byte) 0));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m47754a(Class<? extends ShareContent> cls) {
        AbstractC24744h b = m47755b(cls);
        if (b == null || !C24745i.m47380a(b)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24919a(android.app.Activity r3) {
        /*
            r2 = this;
            int r1 = com.facebook.share.p1908a.C24919a.f59161e
            r2.<init>(r3, r1)
            r0 = 1
            r2.f59163f = r0
            java.lang.Class<com.facebook.share.internal.k> r0 = com.facebook.share.internal.C24954k.class
            boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r0)
            if (r0 != 0) goto L_0x001f
            com.facebook.share.internal.k$4 r0 = new com.facebook.share.internal.k$4     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            com.facebook.internal.C24739e.m47368a(r1, r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            java.lang.Class<com.facebook.share.internal.k> r0 = com.facebook.share.internal.C24954k.class
            com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r1, r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.p1908a.C24919a.<init>(android.app.Activity):void");
    }

    /* renamed from: a */
    public static boolean m47753a(ShareContent shareContent) {
        Class<?> cls = shareContent.getClass();
        if (!ShareLinkContent.class.isAssignableFrom(cls) && !ShareOpenGraphContent.class.isAssignableFrom(cls) && (!SharePhotoContent.class.isAssignableFrom(cls) || !AccessToken.m45056a())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C24954k.m47870a((ShareOpenGraphContent) shareContent);
            } catch (Exception unused) {
                C24693ad.m47277d(f59160d);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static AbstractC24744h m47755b(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return EnumC24953j.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return EnumC24953j.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return EnumC24953j.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return EnumC24945f.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return EnumC24953j.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return EnumC24935a.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return EnumC24965l.SHARE_STORY_ASSET;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo40802a(Context context, ShareContent shareContent, EnumC24924c cVar) {
        String str;
        if (this.f59163f) {
            cVar = EnumC24924c.AUTOMATIC;
        }
        int i = C249201.f59164a[cVar.ordinal()];
        String str2 = "unknown";
        if (i == 1) {
            str = "automatic";
        } else if (i == 2) {
            str = "web";
        } else if (i != 3) {
            str = str2;
        } else {
            str = "native";
        }
        AbstractC24744h b = m47755b((Class<? extends ShareContent>) shareContent.getClass());
        if (b == EnumC24953j.SHARE_DIALOG) {
            str2 = "status";
        } else if (b == EnumC24953j.PHOTOS) {
            str2 = UGCMonitor.TYPE_PHOTO;
        } else if (b == EnumC24953j.VIDEO) {
            str2 = "video";
        } else if (b == EnumC24945f.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        C23998m mVar = new C23998m(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        mVar.mo39478d();
    }
}
