package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b;
import com.bytedance.ies.xelement.alphavideo.p1363a.C18971a;
import com.bytedance.ies.xelement.alphavideo.p1363a.C18974c;
import com.bytedance.ies.xelement.alphavideo.p1363a.C18975d;
import com.bytedance.ies.xelement.alphavideo.p1363a.C18978e;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import com.bytedance.ies.xelement.p1362a.EnumC18944b;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.google.gson.C28027t;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58521c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

public final class LynxAlphaVideo extends UISimpleView<C18985d> {

    /* renamed from: m */
    public static final C18948b f44846m = new C18948b((byte) 0);

    /* renamed from: a */
    public AbstractC58539a f44847a;

    /* renamed from: b */
    public C58522a f44848b;

    /* renamed from: c */
    public boolean f44849c = true;

    /* renamed from: d */
    public boolean f44850d = true;

    /* renamed from: e */
    public AbstractC18943a<C18945c> f44851e;

    /* renamed from: f */
    public EnumC18944b f44852f;

    /* renamed from: g */
    public boolean f44853g;

    /* renamed from: h */
    public Bitmap f44854h;

    /* renamed from: i */
    public String f44855i = "";

    /* renamed from: j */
    public final List<Integer> f44856j = new ArrayList();

    /* renamed from: k */
    public final List<Integer> f44857k = new ArrayList();

    /* renamed from: l */
    public int f44858l = -1;

    /* renamed from: n */
    private Set<String> f44859n;

    /* renamed from: o */
    private C58555a<C18979b> f44860o;

    /* renamed from: p */
    private boolean f44861p;

    /* renamed from: q */
    private boolean f44862q;

    /* renamed from: r */
    private final C18969a f44863r;

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$a */
    public interface AbstractC18947a {
        static {
            Covode.recordClassIndex(21696);
        }

        /* renamed from: a */
        void mo30091a();

        /* renamed from: a */
        void mo30092a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(21693);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -2133601602:
                    if (nextKey.equals("keep-last-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setKeepLastFrame(z);
                        continue;
                    }
                    break;
                case -982450867:
                    if (nextKey.equals("poster")) {
                        setPoster(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z);
                        continue;
                    }
                    break;
                case 838895478:
                    if (nextKey.equals("last-frame")) {
                        setLastFrame(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        boolean z2 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoPlay(z2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$b */
    public static final class C18948b {
        static {
            Covode.recordClassIndex(21697);
        }

        private C18948b() {
        }

        public /* synthetic */ C18948b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$k */
    public static final class C18957k extends C28724b {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44878a;

        /* renamed from: b */
        final /* synthetic */ Map f44879b;

        /* renamed from: c */
        final /* synthetic */ String f44880c;

        static {
            Covode.recordClassIndex(21706);
        }

        @Override // com.lynx.tasm.p2054c.C28724b
        /* renamed from: a */
        public final Map<String, Object> mo30096a() {
            return this.f44879b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18957k(LynxAlphaVideo lynxAlphaVideo, Map map, String str, int i, String str2) {
            super(i, str2);
            this.f44878a = lynxAlphaVideo;
            this.f44879b = map;
            this.f44880c = str;
        }
    }

    /* renamed from: a */
    public final void mo30072a(String str, Map<String, Object> map) {
        AbstractC28520j jVar;
        C28719c cVar;
        Set<String> set = this.f44859n;
        if (set != null && set.contains(str) && (jVar = this.mContext) != null && (cVar = jVar.f67064e) != null) {
            cVar.mo49834a(new C18957k(this, map, str, getSign(), str));
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void onDetach() {
        super.onDetach();
        AbstractC58539a aVar = this.f44847a;
        if (aVar != null) {
            aVar.mo16772b((ViewGroup) this.mView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$l */
    public static final class CallableC18958l<V> implements Callable<C18974c<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44881a;

        /* renamed from: b */
        final /* synthetic */ String f44882b;

        static {
            Covode.recordClassIndex(21707);
        }

        CallableC18958l(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f44881a = lynxAlphaVideo;
            this.f44882b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C18974c<Bitmap> call() {
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            this.f44881a.mo30069a(this.f44882b, new AbstractC18947a(this) {
                /* class com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.CallableC18958l.C189591 */

                /* renamed from: a */
                final /* synthetic */ CallableC18958l f44883a;

                static {
                    Covode.recordClassIndex(21708);
                }

                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.AbstractC18947a
                /* renamed from: a */
                public final void mo30091a() {
                    C58522a aVar = this.f44883a.f44881a.f44848b;
                    if (aVar != null) {
                        aVar.mo95922b(true);
                    }
                    this.f44883a.f44881a.mo30071a("set video lastFrame failed, lastFrame is " + this.f44883a.f44882b, this.f44883a.f44881a.f44855i, -16);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.graphics.Bitmap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.AbstractC18947a
                /* renamed from: a */
                public final void mo30092a(Bitmap bitmap) {
                    if (bitmap != 0) {
                        eVar.element = bitmap;
                    }
                }

                {
                    this.f44883a = r1;
                }
            });
            return new C18974c((Object) eVar.element);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$o */
    public static final class CallableC18962o<V> implements Callable<C18974c<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44888a;

        /* renamed from: b */
        final /* synthetic */ String f44889b;

        static {
            Covode.recordClassIndex(21711);
        }

        CallableC18962o(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f44888a = lynxAlphaVideo;
            this.f44889b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C18974c<Bitmap> call() {
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            this.f44888a.mo30069a(this.f44889b, new AbstractC18947a(this) {
                /* class com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.CallableC18962o.C189631 */

                /* renamed from: a */
                final /* synthetic */ CallableC18962o f44890a;

                static {
                    Covode.recordClassIndex(21712);
                }

                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.AbstractC18947a
                /* renamed from: a */
                public final void mo30091a() {
                    this.f44890a.f44888a.mo30071a("set video poster failed, poster is " + this.f44890a.f44889b, this.f44890a.f44888a.f44855i, -15);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.graphics.Bitmap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.AbstractC18947a
                /* renamed from: a */
                public final void mo30092a(Bitmap bitmap) {
                    if (bitmap != 0) {
                        eVar.element = bitmap;
                    }
                }

                {
                    this.f44890a = r1;
                }
            });
            return new C18974c((Object) eVar.element);
        }
    }

    /* renamed from: a */
    private static JavaOnlyMap m35149a() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        return javaOnlyMap;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void onAttach() {
        super.onAttach();
        AbstractC58539a aVar = this.f44847a;
        if (aVar != null && this.f44849c) {
            aVar.mo16766a((ViewGroup) this.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        AbstractC58539a aVar = this.f44847a;
        if (aVar == null) {
            C89219l.m154707a();
        }
        aVar.mo16762a().layout(0, 0, getWidth(), getHeight());
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void destroy() {
        super.destroy();
        AbstractC58539a aVar = this.f44847a;
        if (aVar == null) {
            C89219l.m154707a();
        }
        aVar.mo16778g();
        AbstractC58539a aVar2 = this.f44847a;
        if (aVar2 == null) {
            C89219l.m154707a();
        }
        aVar2.mo16772b((ViewGroup) this.mView);
        ((C18985d) this.mView).setMPoster(null);
        ((C18985d) this.mView).setMLastFrame(null);
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$d */
    public static final class C18950d implements AbstractC58510a {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44865a;

        static {
            Covode.recordClassIndex(21699);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        public final void mo16674a() {
            LLog.m56860b("x-alpha-video", "start action, url is " + this.f44865a.f44855i);
            this.f44865a.mo30072a("start", LynxAlphaVideo.m35150a(1, "start video", (JavaOnlyMap) null));
            ((C18985d) this.f44865a.mView).setMIsShowPoster(false);
            ((C18985d) this.f44865a.mView).f44928b = null;
            ((C18985d) this.f44865a.mView).invalidate();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: b */
        public final void mo16676b() {
            LLog.m56860b("x-alpha-video", "endAction action, url is " + this.f44865a.f44855i);
            ((C18985d) this.f44865a.mView).setMIsShowLastFrame(true);
            ((C18985d) this.f44865a.mView).setMLastFrame(this.f44865a.f44854h);
            ((C18985d) this.f44865a.mView).setMPoster(null);
            ((C18985d) this.f44865a.mView).setMIsShowPoster(false);
            ((C18985d) this.f44865a.mView).f44927a = null;
            ((C18985d) this.f44865a.mView).invalidate();
            this.f44865a.mo30072a("completion", LynxAlphaVideo.m35150a(2, "play video success", (JavaOnlyMap) null));
            AbstractC58539a aVar = this.f44865a.f44847a;
            if (aVar == null) {
                C89219l.m154707a();
            }
            aVar.mo16777f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18950d(LynxAlphaVideo lynxAlphaVideo) {
            this.f44865a = lynxAlphaVideo;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        public final void mo16675a(int i, int i2, C58522a.EnumC58526d dVar) {
            C89219l.m154719c(dVar, "");
            LLog.m56860b("x-alpha-video", "onVideoSizeChange: videoWidth = " + i + " videoHeight = " + i2 + " scaleType = " + dVar.name());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$h */
    public static final class CallableC18954h<V> implements Callable<C18974c<String>> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44873a;

        /* renamed from: b */
        final /* synthetic */ String f44874b;

        /* renamed from: c */
        final /* synthetic */ String f44875c;

        static {
            Covode.recordClassIndex(21703);
        }

        CallableC18954h(LynxAlphaVideo lynxAlphaVideo, String str, String str2) {
            this.f44873a = lynxAlphaVideo;
            this.f44874b = str;
            this.f44875c = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C18974c<String> call() {
            String str;
            StringBuilder append;
            try {
                File file = new File(this.f44874b);
                if (file.isDirectory()) {
                    LLog.m56860b("x-alpha-video", "try to load resource which is already unzip, directUrl is " + this.f44875c);
                    LynxAlphaVideo lynxAlphaVideo = this.f44873a;
                    lynxAlphaVideo.f44848b = lynxAlphaVideo.mo30073b(file.getAbsolutePath() + File.separator);
                    return new C18974c<>("success");
                } else if (!C89361p.m154876c(this.f44874b, ".zip", false)) {
                    return new C18974c<>("fail, resource type is not support");
                } else {
                    LLog.m56860b("x-alpha-video", "try to load .zip resource, directUrl is " + this.f44875c);
                    StringBuilder sb = new StringBuilder();
                    AbstractC28520j jVar = this.f44873a.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    File cacheDir = jVar.getCacheDir();
                    C89219l.m154709a((Object) cacheDir, "");
                    String sb2 = sb.append(cacheDir.getAbsolutePath()).append(File.separator).append(UUID.randomUUID().toString()).toString();
                    try {
                        str = C18978e.m35189a(file, sb2);
                        C89219l.m154709a((Object) str, "");
                    } catch (Exception e) {
                        this.f44873a.mo30071a("unzip resource failed, error msg is " + e.getMessage(), this.f44873a.f44855i, -2);
                        new C18974c("fail");
                        str = "";
                    }
                    if (C89219l.m154714a((Object) str, (Object) "")) {
                        append = new StringBuilder().append(sb2).append(File.separator);
                    } else {
                        append = new StringBuilder().append(sb2).append(File.separator).append(str);
                    }
                    String sb3 = append.toString();
                    LynxAlphaVideo lynxAlphaVideo2 = this.f44873a;
                    lynxAlphaVideo2.f44848b = lynxAlphaVideo2.mo30073b(sb3);
                    return new C18974c<>("success");
                }
            } catch (Exception e2) {
                return new C18974c<>("fail, error msg is ".concat(String.valueOf(e2)));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$e */
    public static final class C18951e implements AbstractC58511b {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44866a;

        static {
            Covode.recordClassIndex(21700);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18951e(LynxAlphaVideo lynxAlphaVideo) {
            this.f44866a = lynxAlphaVideo;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b
        /* renamed from: a */
        public final void mo16677a(String str, Exception exc) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(exc, "");
            this.f44866a.mo30071a("failed when init media player, and player is " + str + ", error msg is " + exc + ' ', this.f44866a.f44855i, -8);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b
        /* renamed from: a */
        public final void mo16678a(boolean z, String str, int i, int i2, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f44866a.mo30071a("failed when monitor: state = " + z + ", playerType = " + str + ", what = " + i + ", extra = " + i2 + ", errorInfo = " + str2, this.f44866a.f44855i, -9);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$g */
    public static final class C18953g extends AbstractC24435b {

        /* renamed from: a */
        final /* synthetic */ AbstractC18947a f44870a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f44871b;

        /* renamed from: c */
        final /* synthetic */ AbstractC24157c f44872c;

        static {
            Covode.recordClassIndex(21702);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            this.f44870a.mo30091a();
            if (cVar != null) {
                cVar.mo39750g();
            }
            this.f44871b.countDown();
        }

        @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
        /* renamed from: a */
        public final void mo9033a(Bitmap bitmap) {
            MethodCollector.m26663i(10574);
            if (this.f44872c.mo39745b() && bitmap != null) {
                this.f44870a.mo30092a(bitmap.copy(bitmap.getConfig(), true));
                this.f44872c.mo39750g();
            }
            this.f44871b.countDown();
            MethodCollector.m26664o(10574);
        }

        C18953g(AbstractC18947a aVar, CountDownLatch countDownLatch, AbstractC24157c cVar) {
            this.f44870a = aVar;
            this.f44871b = countDownLatch;
            this.f44872c = cVar;
        }
    }

    /* renamed from: a */
    private static Context m35147a(AbstractC28520j jVar) {
        Context applicationContext = jVar.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, C28723a> map) {
        Set<String> set;
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.f44859n = set;
    }

    @AbstractC28525m(mo49059a = "keep-last-frame", mo49064f = false)
    public final void setKeepLastFrame(boolean z) {
        if (this.f44862q != z) {
            C58522a aVar = this.f44848b;
            if (aVar != null) {
                aVar.mo95922b(!z);
            }
            this.f44862q = z;
        }
    }

    @AbstractC28525m(mo49059a = "loop", mo49064f = false)
    public final void setLoop(boolean z) {
        this.f44861p = z;
        C58522a aVar = this.f44848b;
        if (aVar != null) {
            aVar.mo95920a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$j */
    public static final class C18956j<T> implements AbstractC18973b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44877a;

        static {
            Covode.recordClassIndex(21705);
        }

        C18956j(LynxAlphaVideo lynxAlphaVideo) {
            this.f44877a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(Throwable th) {
            this.f44877a.mo30071a("unknown exception, ".concat(String.valueOf(th)), this.f44877a.f44855i, -6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$p */
    public static final class C18964p<T> implements AbstractC18973b<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44892a;

        static {
            Covode.recordClassIndex(21713);
        }

        C18964p(LynxAlphaVideo lynxAlphaVideo) {
            this.f44892a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            LynxAlphaVideo lynxAlphaVideo = this.f44892a;
            if (bitmap2 != null) {
                ((C18985d) lynxAlphaVideo.mView).setMPoster(bitmap2);
                ((C18985d) lynxAlphaVideo.mView).setMIsShowPoster(true);
                ((C18985d) lynxAlphaVideo.mView).invalidate();
            }
        }
    }

    /* renamed from: b */
    private static File m35151b(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    @AbstractC28525m(mo49059a = "autoplay", mo49064f = true)
    public final void setAutoPlay(boolean z) {
        this.f44849c = z;
        View view = this.mView;
        if (view != null) {
            ((C18985d) view).setMAutoPlay(z);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$m */
    public static final class C18960m<T> implements AbstractC18973b<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44885a;

        static {
            Covode.recordClassIndex(21709);
        }

        C18960m(LynxAlphaVideo lynxAlphaVideo) {
            this.f44885a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            LynxAlphaVideo lynxAlphaVideo = this.f44885a;
            if (bitmap2 != null) {
                C58522a aVar = lynxAlphaVideo.f44848b;
                if (aVar != null) {
                    aVar.mo95922b(true);
                }
                lynxAlphaVideo.f44854h = bitmap2;
                ((C18985d) lynxAlphaVideo.mView).setMLastFrame(lynxAlphaVideo.f44854h);
                ((C18985d) lynxAlphaVideo.mView).setMIsShowLastFrame(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$n */
    public static final class C18961n<T> implements AbstractC18973b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44886a;

        /* renamed from: b */
        final /* synthetic */ String f44887b;

        static {
            Covode.recordClassIndex(21710);
        }

        C18961n(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f44886a = lynxAlphaVideo;
            this.f44887b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(Throwable th) {
            C58522a aVar = this.f44886a.f44848b;
            if (aVar != null) {
                aVar.mo95922b(true);
            }
            this.f44886a.mo30071a("set video lastFrame failed, lastFrame is " + this.f44887b + ", error msg is " + th, this.f44886a.f44855i, -16);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$q */
    public static final class C18965q<T> implements AbstractC18973b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44893a;

        /* renamed from: b */
        final /* synthetic */ String f44894b;

        static {
            Covode.recordClassIndex(21714);
        }

        C18965q(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f44893a = lynxAlphaVideo;
            this.f44894b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(Throwable th) {
            this.f44893a.mo30071a("set video poster failed, poster is " + this.f44894b + ", error msg is " + th, this.f44893a.f44855i, -15);
        }
    }

    @AbstractC28525m(mo49059a = "last-frame")
    public final void setLastFrame(String str) {
        C89219l.m154719c(str, "");
        new C18975d(new CallableC18958l(this, str)).mo30104a(new C18960m(this)).mo30108b(new C18961n(this, str));
    }

    @AbstractC28525m(mo49059a = "poster")
    public final void setPoster(String str) {
        C89219l.m154719c(str, "");
        new C18975d(new CallableC18962o(this, str)).mo30104a(new C18964p(this)).mo30108b(new C18965q(this, str));
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$f */
    public static final class C18952f extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44867a;

        /* renamed from: b */
        final /* synthetic */ String f44868b;

        /* renamed from: c */
        final /* synthetic */ Uri f44869c;

        static {
            Covode.recordClassIndex(21701);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            LLog.m56860b("x-alpha-video", "download resource success, and directUrl is " + this.f44868b);
            StringBuilder sb = new StringBuilder();
            AbstractC28520j jVar = this.f44867a.mContext;
            C89219l.m154709a((Object) jVar, "");
            Context applicationContext = jVar.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154709a((Object) applicationContext, "");
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = applicationContext.getCacheDir();
            }
            File file = C58016d.f132221b;
            C89219l.m154709a((Object) file, "");
            StringBuilder append = sb.append(file.getAbsolutePath()).append('/');
            Uri uri = this.f44869c;
            C89219l.m154709a((Object) uri, "");
            this.f44867a.mo30070a(append.append(uri.getLastPathSegment()).toString(), this.f44868b);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str = "download resource failed and resource is " + this.f44868b + ", error msg is " + baseException;
            LynxAlphaVideo lynxAlphaVideo = this.f44867a;
            lynxAlphaVideo.mo30071a(str, lynxAlphaVideo.f44855i, -12);
            this.f44867a.mContext.mo49039a(this.f44868b, "video", str);
        }

        C18952f(LynxAlphaVideo lynxAlphaVideo, String str, Uri uri) {
            this.f44867a = lynxAlphaVideo;
            this.f44868b = str;
            this.f44869c = uri;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$i */
    public static final class C18955i<T> implements AbstractC18973b<String> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44876a;

        static {
            Covode.recordClassIndex(21704);
        }

        C18955i(LynxAlphaVideo lynxAlphaVideo) {
            this.f44876a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.p1363a.AbstractC18973b
        /* renamed from: a */
        public final /* synthetic */ void mo30095a(String str) {
            LynxAlphaVideo lynxAlphaVideo = this.f44876a;
            if (str == "success") {
                lynxAlphaVideo.mo30072a("ready", LynxAlphaVideo.m35150a(1, "load resource success", (JavaOnlyMap) null));
                if (lynxAlphaVideo.f44848b != null && lynxAlphaVideo.f44849c) {
                    AbstractC58539a aVar = lynxAlphaVideo.f44847a;
                    if (aVar == null) {
                        C89219l.m154707a();
                    }
                    aVar.mo16766a((C18985d) lynxAlphaVideo.mView);
                    AbstractC58539a aVar2 = lynxAlphaVideo.f44847a;
                    if (aVar2 == null) {
                        C89219l.m154707a();
                    }
                    aVar2.mo16769a(lynxAlphaVideo.f44848b);
                    return;
                }
                return;
            }
            lynxAlphaVideo.mo30071a("unknown exception, ".concat(String.valueOf(str)), lynxAlphaVideo.f44855i, -6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$r */
    public static final class C18966r extends AbstractC89220m implements AbstractC89172b<C18945c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44895a;

        /* renamed from: b */
        final /* synthetic */ String f44896b;

        static {
            Covode.recordClassIndex(21715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18966r(LynxAlphaVideo lynxAlphaVideo, String str) {
            super(1);
            this.f44895a = lynxAlphaVideo;
            this.f44896b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C18945c cVar) {
            String str;
            C18945c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            this.f44895a.f44853g = true;
            this.f44895a.f44852f = cVar2.f44844d;
            LLog.m56860b("x-alpha-video", "load resource success: " + cVar2.f44842b + ", " + cVar2.f44843c);
            EnumC18944b bVar = cVar2.f44844d;
            if (bVar != null) {
                int i = C18984c.f44926a[bVar.ordinal()];
                if (i == 1 || i == 2) {
                    String str2 = cVar2.f44842b;
                    if (str2 != null) {
                        LynxAlphaVideo lynxAlphaVideo = this.f44895a;
                        String str3 = this.f44896b;
                        C89219l.m154709a((Object) str3, "");
                        lynxAlphaVideo.mo30070a(str2, str3);
                    }
                } else if (i == 3 && (str = cVar2.f44842b) != null) {
                    this.f44895a.mo30068a(str);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18985d createView(Context context) {
        C18985d dVar = new C18985d(context);
        C58521c a = new C58521c().mo95916a(context).mo95917a(dVar).mo95915a();
        C18950d dVar2 = new C18950d(this);
        C18951e eVar = new C18951e(this);
        try {
            C18979b bVar = new C18979b(context);
            this.f44860o = bVar;
            this.f44847a = PlayerController.m107491a(a, bVar);
        } catch (Exception e) {
            mo30071a("init CustomPlayerImpl failed and try to use DefaultSystemPlayer, the exception is ".concat(String.valueOf(e)), this.f44855i, -10);
            this.f44847a = PlayerController.m107491a(a, new C58556b());
        }
        AbstractC58539a aVar = this.f44847a;
        if (aVar != null) {
            aVar.mo16763a(dVar2);
        }
        AbstractC58539a aVar2 = this.f44847a;
        if (aVar2 != null) {
            aVar2.mo16767a(eVar);
        }
        AbstractC58539a aVar3 = this.f44847a;
        if (aVar3 != null) {
            aVar3.mo16768a(new C18949c(this));
        }
        return dVar;
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC58539a aVar = this.f44847a;
            if (aVar == null) {
                C89219l.m154707a();
            }
            aVar.mo16772b((ViewGroup) this.mView);
            this.f44848b = null;
            this.f44855i = "";
            if (this.f44850d) {
                str = C28621a.m57207a(this.mContext, str);
            }
            String decode = URLDecoder.decode(str, "UTF-8");
            C89219l.m154709a((Object) decode, "");
            this.f44855i = decode;
            AbstractC18943a<C18945c> aVar2 = this.f44851e;
            if (aVar2 != null) {
                this.f44852f = null;
                aVar2.mo30064a(decode, new C18966r(this, decode), new C18967s(this, decode));
                return;
            }
            mo30068a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$c */
    public static final class C18949c implements AbstractC58513d {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44864a;

        static {
            Covode.recordClassIndex(21698);
        }

        C18949c(LynxAlphaVideo lynxAlphaVideo) {
            this.f44864a = lynxAlphaVideo;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d
        /* renamed from: a */
        public final void mo30093a(long j) {
            try {
                LynxAlphaVideo lynxAlphaVideo = this.f44864a;
                AbstractC58539a aVar = lynxAlphaVideo.f44847a;
                if (aVar == null) {
                    C89219l.m154707a();
                }
                lynxAlphaVideo.f44858l = aVar.mo16774c();
                int size = this.f44864a.f44857k.size();
                if (size < this.f44864a.f44856j.size()) {
                    int intValue = this.f44864a.f44856j.get(this.f44864a.f44857k.size()).intValue();
                    if (((long) intValue) <= j) {
                        LLog.m56860b("x-alpha-video", "send trackedMSCount is " + size + ", trackedMS is " + intValue + ", progress is " + j);
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                        javaOnlyMap.putMap("detail", javaOnlyMap2);
                        javaOnlyMap2.putInt("subscribedMillisecond", intValue);
                        this.f44864a.mo30072a("update", LynxAlphaVideo.m35150a(1, "", javaOnlyMap));
                        this.f44864a.f44857k.add(Integer.valueOf(intValue));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                LLog.m56862d("x-alpha-video", e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo30068a(String str) {
        try {
            this.f44853g = false;
            LLog.m56860b("x-alpha-video", "legacySetSrc, directUrl is ".concat(String.valueOf(str)));
            if (str != null) {
                Uri parse = Uri.parse(str);
                this.f44848b = null;
                C89219l.m154709a((Object) parse, "");
                String scheme = parse.getScheme();
                if (scheme != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode != 3143036) {
                        if (hashCode != 3213448) {
                            if (hashCode != 99617003 || !scheme.equals("https")) {
                                return;
                            }
                        } else if (!scheme.equals("http")) {
                            return;
                        }
                        if (C89361p.m154876c(str, ".zip", false)) {
                            DownloadTask name = Downloader.with(this.mContext).url(str).name(parse.getLastPathSegment());
                            AbstractC28520j jVar = this.mContext;
                            C89219l.m154709a((Object) jVar, "");
                            Context a = m35147a(jVar);
                            C89219l.m154709a((Object) a, "");
                            File b = m35151b(a);
                            C89219l.m154709a((Object) b, "");
                            name.savePath(b.getAbsolutePath()).mainThreadListener(new C18952f(this, str, parse)).download();
                            return;
                        }
                        mo30071a("resource type is not support", this.f44855i, -13);
                    } else if (scheme.equals("file")) {
                        try {
                            this.f44848b = mo30073b(parse.getPath() + '/');
                            mo30072a("ready", m35150a(1, "load resource success", (JavaOnlyMap) null));
                            if (this.f44848b != null && this.f44849c) {
                                AbstractC58539a aVar = this.f44847a;
                                if (aVar == null) {
                                    C89219l.m154707a();
                                }
                                aVar.mo16766a((ViewGroup) this.mView);
                                AbstractC58539a aVar2 = this.f44847a;
                                if (aVar2 == null) {
                                    C89219l.m154707a();
                                }
                                aVar2.mo16769a(this.f44848b);
                            }
                        } catch (Exception e) {
                            mo30071a("parse config.json failed, resource is " + str + ", error msg is " + e, this.f44855i, -3);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            LLog.m56862d("x-alpha-video", e2.toString());
        }
    }

    /* renamed from: b */
    public final C58522a mo30073b(String str) {
        MethodCollector.m26663i(9160);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str + "config.json"));
        try {
            BufferedReader bufferedReader2 = bufferedReader;
            C89233z.C89238e eVar = new C89233z.C89238e();
            while (true) {
                T t = (T) bufferedReader2.readLine();
                eVar.element = t;
                if (t == null) {
                    break;
                }
                sb.append((String) eVar.element).append("\n");
            }
            C89146c.m154636a(bufferedReader, null);
            try {
                C18987f fVar = (C18987f) C18971a.m35180a().mo46670a(sb.toString(), C18987f.class);
                if (fVar == null) {
                    mo30071a("fileModel is null", this.f44855i, -14);
                    MethodCollector.m26664o(9160);
                    return null;
                }
                C58522a aVar = new C58522a();
                if (fVar.f44939a != null) {
                    aVar.mo95919a(new C58522a.C58524b(str + fVar.f44939a.f44941a).mo95935a(fVar.f44939a.f44942b).mo95939b(fVar.f44939a.f44943c).mo95942c(fVar.f44939a.f44944d).mo95943d(fVar.f44939a.f44947g).mo95944e(fVar.f44939a.f44948h).mo95945f(fVar.f44939a.f44945e).mo95946g(fVar.f44939a.f44946f).mo95937a(fVar.f44939a.f44949i).mo95940b(fVar.f44939a.f44950j).mo95936a(fVar.f44939a.f44951k));
                }
                if (fVar.f44940b != null) {
                    aVar.mo95921b(new C58522a.C58524b(str + fVar.f44940b.f44941a).mo95935a(fVar.f44940b.f44942b).mo95939b(fVar.f44940b.f44943c).mo95942c(fVar.f44940b.f44944d).mo95943d(fVar.f44940b.f44947g).mo95944e(fVar.f44940b.f44948h).mo95945f(fVar.f44940b.f44945e).mo95946g(fVar.f44940b.f44946f).mo95937a(fVar.f44940b.f44949i).mo95940b(fVar.f44940b.f44950j).mo95936a(fVar.f44940b.f44951k));
                }
                if (C89219l.m154714a(getProps().get("keep-last-frame"), (Object) true)) {
                    aVar.mo95922b(false);
                }
                if (C89219l.m154714a(getProps().get("loop"), (Object) true)) {
                    aVar.mo95920a(true);
                }
                MethodCollector.m26664o(9160);
                return aVar;
            } catch (C28027t e) {
                mo30071a("parse config.json failed, error msg is ".concat(String.valueOf(e)), this.f44855i, -3);
            }
        } catch (Throwable th) {
            C89146c.m154636a(bufferedReader, th);
            MethodCollector.m26664o(9160);
            throw th;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$t */
    public static final class C18968t<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(21717);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.intValue()), Integer.valueOf(t2.intValue()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxAlphaVideo(AbstractC28520j jVar, String str) {
        super(jVar);
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(str, "");
        this.f44863r = new C18969a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo$s */
    public static final class C18967s extends AbstractC89220m implements AbstractC89183m<Throwable, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxAlphaVideo f44897a;

        /* renamed from: b */
        final /* synthetic */ String f44898b;

        static {
            Covode.recordClassIndex(21716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18967s(LynxAlphaVideo lynxAlphaVideo, String str) {
            super(2);
            this.f44897a = lynxAlphaVideo;
            this.f44898b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Throwable th, Boolean bool) {
            Throwable th2 = th;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154719c(th2, "");
            String str = "failed when use resource loader to load " + this.f44897a.f44855i + ", and error msg " + String.valueOf(th2.getMessage());
            if (booleanValue) {
                LLog.m56860b("x-alpha-video", str);
                this.f44897a.mo30068a(this.f44898b);
            } else {
                LynxAlphaVideo lynxAlphaVideo = this.f44897a;
                lynxAlphaVideo.mo30071a(str, lynxAlphaVideo.f44855i, -11);
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC28528p
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || this.f44847a == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            javaOnlyMap.putBoolean("success", true);
            AbstractC58539a aVar = this.f44847a;
            if (aVar == null) {
                C89219l.m154707a();
            }
            int c = aVar.mo16774c();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putInt("duration", c);
            javaOnlyMap.putMap("data", javaOnlyMap2);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e) {
            javaOnlyMap.putString("message:", e.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void isPlaying(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || this.f44847a == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            javaOnlyMap.putBoolean("success", true);
            AbstractC58539a aVar = this.f44847a;
            if (aVar == null) {
                C89219l.m154707a();
            }
            boolean b = aVar.mo16773b();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putBoolean("isPlaying", b);
            javaOnlyMap.putMap("data", javaOnlyMap2);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e) {
            javaOnlyMap.putString("message:", e.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void pause(ReadableMap readableMap, Callback callback) {
        AbstractC58539a aVar;
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f44847a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            aVar.mo16775d();
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e) {
            javaOnlyMap.putString("message:", e.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void play(ReadableMap readableMap, Callback callback) {
        AbstractC58539a aVar;
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f44847a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            if (aVar.mo16773b() || this.f44848b == null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            AbstractC58539a aVar2 = this.f44847a;
            if (aVar2 == null) {
                C89219l.m154707a();
            }
            aVar2.mo16766a((ViewGroup) this.mView);
            AbstractC58539a aVar3 = this.f44847a;
            if (aVar3 == null) {
                C89219l.m154707a();
            }
            aVar3.mo16769a(this.f44848b);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e) {
            javaOnlyMap.putString("message:", e.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void release(ReadableMap readableMap, Callback callback) {
        AbstractC58539a aVar;
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap a = m35149a();
        if (this.mView == null || (aVar = this.f44847a) == null) {
            a.putString("message", "view is not exist");
            callback.invoke(1, a);
            return;
        }
        try {
            aVar.mo16778g();
            callback.invoke(0, a);
        } catch (Exception e) {
            a.putString("message:", e.getMessage());
            callback.invoke(1, a);
        }
    }

    @AbstractC28528p
    public final void resume(ReadableMap readableMap, Callback callback) {
        AbstractC58539a aVar;
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap a = m35149a();
        if (this.mView == null || (aVar = this.f44847a) == null || aVar.mo16773b()) {
            a.putString("message", "view is not exist");
            callback.invoke(1, a);
            return;
        }
        try {
            AbstractC58539a aVar2 = this.f44847a;
            if (aVar2 == null) {
                C89219l.m154707a();
            }
            aVar2.mo16766a((ViewGroup) this.mView);
            AbstractC58539a aVar3 = this.f44847a;
            if (aVar3 == null) {
                C89219l.m154707a();
            }
            aVar3.mo16776e();
            callback.invoke(0, a);
        } catch (Exception e) {
            a.putString("message:", e.getMessage());
            callback.invoke(1, a);
        }
    }

    @AbstractC28528p
    public final void stop(ReadableMap readableMap, Callback callback) {
        AbstractC58539a aVar;
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f44847a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            aVar.mo16777f();
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e) {
            javaOnlyMap.putString("message:", e.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        int i = readableMap.getInt("ms");
        LLog.m56860b("x-alpha-video", "subscribeUpdateEvent: ".concat(String.valueOf(i)));
        if (!this.f44856j.contains(Integer.valueOf(i))) {
            this.f44856j.add(Integer.valueOf(i));
            List<Integer> list = this.f44856j;
            if (list.size() > 1) {
                C89070n.m154530a((List) list, (Comparator) new C18968t());
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, "already subscribeUpdateEvent with " + i + " milliseconds");
        }
    }

    @AbstractC28528p
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        int i = readableMap.getInt("ms");
        if (this.f44856j.contains(Integer.valueOf(i))) {
            this.f44856j.remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, i + " milliseconds is not subscribed");
        }
    }

    /* renamed from: a */
    public final void mo30069a(String str, AbstractC18947a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        String a = C28621a.m57207a(this.mContext, str);
        C89219l.m154709a((Object) a, "");
        AbstractC24157c<C24117a<AbstractC24454c>> a2 = C24182c.m45844c().mo40224a(C28884b.m57860a(C24639c.m47149a(Uri.parse(a))).mo40483a(), "x-alpha-video");
        if (a2 == null) {
            aVar.mo30091a();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C18953g gVar = new C18953g(aVar, countDownLatch, a2);
        a2.mo39739a(gVar, C24065a.m45575a());
        try {
            if (!countDownLatch.await(3, TimeUnit.SECONDS)) {
                gVar.onFailure(a2);
            }
        } catch (InterruptedException unused) {
            gVar.onFailure(a2);
        }
    }

    /* renamed from: a */
    public final void mo30070a(String str, String str2) {
        new C18975d(new CallableC18954h(this, str, str2)).mo30104a(new C18955i(this)).mo30108b(new C18956j(this));
    }

    /* renamed from: a */
    public static Map<String, Object> m35150a(int i, String str, JavaOnlyMap javaOnlyMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        if (javaOnlyMap != null) {
            linkedHashMap.put("data", javaOnlyMap);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo30071a(String str, String str2, int i) {
        mo30072a("error", m35150a(i, str, (JavaOnlyMap) null));
        this.f44863r.mo30101a(str2, str, i);
        LLog.m56862d("x-alpha-video", str);
    }
}
