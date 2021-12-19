package com.p2082ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30377o;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30387u;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30388v;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30415i;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30416j;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30426r;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30405d;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30293g;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2188j.C30518d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadTask */
public class DownloadTask {
    private boolean autoSetHashCodeForSameTask;
    private AbstractC30415i chunkAdjustCalculator;
    private AbstractC30416j chunkStrategy;
    private IDownloadDepend depend;
    private AbstractC30377o diskSpaceHandler;
    private final List<AbstractC30369k> downloadCompleteHandlers;
    private DownloadInfo downloadInfo;
    private DownloadInfo.C30585a downloadInfoBuilder;
    private AbstractC30379q fileUriProvider;
    private AbstractC30387u forbiddenHandler;
    private int hashCodeForSameTask;
    private AbstractC30388v interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private AbstractC30389w monitorDepend;
    private boolean needDelayForCacheSync;
    private AbstractC30337ac notificationClickCallback;
    private AbstractC30393y notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private AbstractC30429u retryDelayTimeCalculator;
    private final SparseArray<EnumC30294h> singleListenerHashCodeMap;
    private final Map<EnumC30294h, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    static {
        Covode.recordClassIndex(37116);
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        return this;
    }

    public AbstractC30415i getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public AbstractC30416j getChunkStrategy() {
        return this.chunkStrategy;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public AbstractC30377o getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public List<AbstractC30369k> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public AbstractC30379q getFileUriProvider() {
        return this.fileUriProvider;
    }

    public AbstractC30387u getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public int getHashCodeForSameTask() {
        return this.hashCodeForSameTask;
    }

    public AbstractC30388v getInterceptor() {
        return this.interceptor;
    }

    public AbstractC30389w getMonitorDepend() {
        return this.monitorDepend;
    }

    public AbstractC30337ac getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public AbstractC30393y getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public AbstractC30429u getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isAutoSetHashCodeForSameTask() {
        return this.autoSetHashCodeForSameTask;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 != null) {
            return downloadInfo2.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 == null) {
            return 0;
        }
        return downloadInfo2.getId();
    }

    private void setChunkCalculator() {
        if (this.downloadInfo.getThrottleNetSpeed() > 0) {
            chunkStategy(new AbstractC30416j() {
                /* class com.p2082ss.android.socialbase.downloader.model.DownloadTask.C305872 */

                static {
                    Covode.recordClassIndex(37118);
                }

                @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30416j
                /* renamed from: a */
                public final int mo54081a(long j) {
                    return 1;
                }
            });
        }
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadCompleteHandlers = new ArrayList();
        this.autoSetHashCodeForSameTask = true;
        this.downloadInfoBuilder = new DownloadInfo.C30585a();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public synchronized int autoCalAndGetHashCodeForSameTask() {
        int i;
        MethodCollector.m26663i(7230);
        IDownloadListener singleDownloadListener = getSingleDownloadListener(EnumC30294h.MAIN);
        if (!(singleDownloadListener == null && (singleDownloadListener = getSingleDownloadListener(EnumC30294h.SUB)) == null)) {
            this.hashCodeForSameTask = singleDownloadListener.hashCode();
        }
        i = this.hashCodeForSameTask;
        MethodCollector.m26664o(7230);
        return i;
    }

    public void addListenerToDownloadingSameTask() {
        C30434a.m62027b("DownloadTask", "same task just tryDownloading, so add listener in last task instead of tryDownload");
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 != null && !downloadInfo2.isAddListenerToSameTask()) {
            this.downloadInfo.setAddListenerToSameTask(true);
        }
        addListenerToDownloadingSameTask(EnumC30294h.MAIN);
        addListenerToDownloadingSameTask(EnumC30294h.SUB);
        C30439a.m62034a(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public int download() {
        int i;
        this.downloadInfo = this.downloadInfoBuilder.mo54673a();
        DownloadInfo b = C30399c.m61733q().mo53777b(this.downloadInfo.getId());
        if (b == null) {
            this.downloadInfo.generateTaskId();
            C30439a.m62039a(this, (BaseException) null, 0);
        } else {
            this.downloadInfo.copyTaskIdFromCacheData(b);
        }
        setChunkCalculator();
        C30405d a = C30405d.m61749a();
        AbstractC30423o a2 = a.mo54050a(this);
        if (a2 == null) {
            AbstractC30389w monitorDepend2 = getMonitorDepend();
            DownloadInfo downloadInfo2 = getDownloadInfo();
            BaseException baseException = new BaseException(1003, "tryDownload but getDownloadHandler failed");
            if (getDownloadInfo() != null) {
                i = getDownloadInfo().getStatus();
            } else {
                i = 0;
            }
            C30439a.m62034a(monitorDepend2, downloadInfo2, baseException, i);
        } else if (isNeedDelayForCacheSync()) {
            a.f72456a.postDelayed(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                  (wrap: android.os.Handler : 0x005e: IGET  (r3v0 android.os.Handler) = (r5v0 'a' com.ss.android.socialbase.downloader.downloader.d) com.ss.android.socialbase.downloader.downloader.d.a android.os.Handler)
                  (wrap: com.ss.android.socialbase.downloader.downloader.d$1 : 0x0062: CONSTRUCTOR  (r2v0 com.ss.android.socialbase.downloader.downloader.d$1) = 
                  (r5v0 'a' com.ss.android.socialbase.downloader.downloader.d)
                  (r1v2 'a2' com.ss.android.socialbase.downloader.downloader.o)
                  (r6v0 'this' com.ss.android.socialbase.downloader.model.DownloadTask A[IMMUTABLE_TYPE, THIS])
                 call: com.ss.android.socialbase.downloader.downloader.d.1.<init>(com.ss.android.socialbase.downloader.downloader.d, com.ss.android.socialbase.downloader.downloader.o, com.ss.android.socialbase.downloader.model.DownloadTask):void type: CONSTRUCTOR)
                  (500 long)
                 type: VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean in method: com.ss.android.socialbase.downloader.model.DownloadTask.download():int, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r2v0 com.ss.android.socialbase.downloader.downloader.d$1) = 
                  (r5v0 'a' com.ss.android.socialbase.downloader.downloader.d)
                  (r1v2 'a2' com.ss.android.socialbase.downloader.downloader.o)
                  (r6v0 'this' com.ss.android.socialbase.downloader.model.DownloadTask A[IMMUTABLE_TYPE, THIS])
                 call: com.ss.android.socialbase.downloader.downloader.d.1.<init>(com.ss.android.socialbase.downloader.downloader.d, com.ss.android.socialbase.downloader.downloader.o, com.ss.android.socialbase.downloader.model.DownloadTask):void type: CONSTRUCTOR in method: com.ss.android.socialbase.downloader.model.DownloadTask.download():int, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.socialbase.downloader.downloader.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.model.DownloadTask.download():int");
        }

        public DownloadTask autoSetHashCodeForSameTask(boolean z) {
            this.autoSetHashCodeForSameTask = z;
            return this;
        }

        public DownloadTask chunkAdjustCalculator(AbstractC30415i iVar) {
            this.chunkAdjustCalculator = iVar;
            return this;
        }

        public DownloadTask chunkStategy(AbstractC30416j jVar) {
            this.chunkStrategy = jVar;
            return this;
        }

        public DownloadTask depend(IDownloadDepend iDownloadDepend) {
            this.depend = iDownloadDepend;
            return this;
        }

        public DownloadTask diskSpaceHandler(AbstractC30377o oVar) {
            this.diskSpaceHandler = oVar;
            return this;
        }

        public DownloadTask fileUriProvider(AbstractC30379q qVar) {
            this.fileUriProvider = qVar;
            return this;
        }

        public DownloadTask forbiddenHandler(AbstractC30387u uVar) {
            this.forbiddenHandler = uVar;
            return this;
        }

        public DownloadTask hashCodeForSameTask(int i) {
            this.hashCodeForSameTask = i;
            return this;
        }

        public DownloadTask interceptor(AbstractC30388v vVar) {
            this.interceptor = vVar;
            return this;
        }

        public DownloadTask monitorDepend(AbstractC30389w wVar) {
            this.monitorDepend = wVar;
            return this;
        }

        public DownloadTask notificationClickCallback(AbstractC30337ac acVar) {
            this.notificationClickCallback = acVar;
            return this;
        }

        public DownloadTask notificationEventListener(AbstractC30393y yVar) {
            this.notificationEventListener = yVar;
            return this;
        }

        public DownloadTask retryDelayTimeCalculator(AbstractC30429u uVar) {
            this.retryDelayTimeCalculator = uVar;
            return this;
        }

        public void setNeedDelayForCacheSync(boolean z) {
            this.needDelayForCacheSync = z;
        }

        public void setNotificationEventListener(AbstractC30393y yVar) {
            this.notificationEventListener = yVar;
        }

        public DownloadTask(DownloadInfo downloadInfo2) {
            this();
            this.downloadInfo = downloadInfo2;
        }

        public DownloadTask addListenerToSameTask(boolean z) {
            this.downloadInfoBuilder.f72949O = z;
            return this;
        }

        public DownloadTask addTTNetCommonParam(boolean z) {
            this.downloadInfoBuilder.f72958X = z;
            return this;
        }

        public DownloadTask autoResumed(boolean z) {
            this.downloadInfoBuilder.f72983w = z;
            return this;
        }

        public DownloadTask backUpUrlRetryCount(int i) {
            this.downloadInfoBuilder.f72973m = i;
            return this;
        }

        public DownloadTask backUpUrls(List<String> list) {
            this.downloadInfoBuilder.f72978r = list;
            return this;
        }

        public DownloadTask deleteCacheIfCheckFailed(boolean z) {
            this.downloadInfoBuilder.f72956V = z;
            return this;
        }

        public DownloadTask distinctDirectory(boolean z) {
            this.downloadInfoBuilder.f72959Y = z;
            return this;
        }

        public DownloadTask downloadSetting(JSONObject jSONObject) {
            this.downloadInfoBuilder.f72950P = jSONObject;
            return this;
        }

        public DownloadTask enqueueType(EnumC30293g gVar) {
            this.downloadInfoBuilder.f72942H = gVar;
            return this;
        }

        public DownloadTask executorGroup(int i) {
            this.downloadInfoBuilder.f72954T = i;
            return this;
        }

        public DownloadTask expectFileLength(long j) {
            this.downloadInfoBuilder.f72937C = j;
            return this;
        }

        public DownloadTask expiredRedownload(boolean z) {
            this.downloadInfoBuilder.f72955U = z;
            return this;
        }

        public DownloadTask extra(String str) {
            this.downloadInfoBuilder.f72967g = str;
            return this;
        }

        public DownloadTask extraHeaders(List<HttpHeader> list) {
            this.downloadInfoBuilder.f72968h = list;
            return this;
        }

        public DownloadTask extraMonitorStatus(int[] iArr) {
            this.downloadInfoBuilder.f72953S = iArr;
            return this;
        }

        public DownloadTask force(boolean z) {
            this.downloadInfoBuilder.f72974n = z;
            return this;
        }

        public DownloadTask headConnectionAvailable(boolean z) {
            this.downloadInfoBuilder.f72943I = z;
            return this;
        }

        public DownloadTask iconUrl(String str) {
            this.downloadInfoBuilder.f72946L = str;
            return this;
        }

        public DownloadTask ignoreDataVerify(boolean z) {
            this.downloadInfoBuilder.f72944J = z;
            return this;
        }

        public DownloadTask isOpenLimitSpeed(boolean z) {
            this.downloadInfoBuilder.f72948N = z;
            return this;
        }

        public DownloadTask maxBytes(int i) {
            this.downloadInfoBuilder.f72969i = i;
            return this;
        }

        public DownloadTask maxProgressCount(int i) {
            this.downloadInfoBuilder.f72976p = i;
            return this;
        }

        public DownloadTask md5(String str) {
            this.downloadInfoBuilder.f72936B = str;
            return this;
        }

        public DownloadTask mimeType(String str) {
            this.downloadInfoBuilder.f72981u = str;
            return this;
        }

        public DownloadTask minProgressTimeMsInterval(int i) {
            this.downloadInfoBuilder.f72977q = i;
            return this;
        }

        public DownloadTask monitorScene(String str) {
            this.downloadInfoBuilder.f72952R = str;
            return this;
        }

        public DownloadTask name(String str) {
            this.downloadInfoBuilder.f72961a = str;
            return this;
        }

        public DownloadTask needChunkDowngradeRetry(boolean z) {
            this.downloadInfoBuilder.f72945K = z;
            return this;
        }

        public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
            this.downloadInfoBuilder.f72985y = z;
            return this;
        }

        public DownloadTask needHttpsToHttpRetry(boolean z) {
            this.downloadInfoBuilder.f72982v = z;
            return this;
        }

        public DownloadTask needIndependentProcess(boolean z) {
            this.downloadInfoBuilder.f72941G = z;
            return this;
        }

        public DownloadTask needPostProgress(boolean z) {
            this.downloadInfoBuilder.f72975o = z;
            return this;
        }

        public DownloadTask needRetryDelay(boolean z) {
            this.downloadInfoBuilder.f72938D = z;
            return this;
        }

        public DownloadTask needReuseChunkRunnable(boolean z) {
            this.downloadInfoBuilder.f72986z = z;
            return this;
        }

        public DownloadTask needReuseFirstConnection(boolean z) {
            this.downloadInfoBuilder.f72940F = z;
            return this;
        }

        public DownloadTask needSDKMonitor(boolean z) {
            this.downloadInfoBuilder.f72951Q = z;
            return this;
        }

        public DownloadTask onlyWifi(boolean z) {
            this.downloadInfoBuilder.f72966f = z;
            return this;
        }

        public DownloadTask outIp(String[] strArr) {
            this.downloadInfoBuilder.f72970j = strArr;
            return this;
        }

        public DownloadTask outSize(int[] iArr) {
            this.downloadInfoBuilder.f72971k = iArr;
            return this;
        }

        public DownloadTask packageName(String str) {
            this.downloadInfoBuilder.f72935A = str;
            return this;
        }

        public DownloadTask retryCount(int i) {
            this.downloadInfoBuilder.f72972l = i;
            return this;
        }

        public DownloadTask retryDelayTimeArray(String str) {
            this.downloadInfoBuilder.f72939E = str;
            return this;
        }

        public DownloadTask savePath(String str) {
            this.downloadInfoBuilder.f72964d = str;
            return this;
        }

        public DownloadTask setAutoInstall(boolean z) {
            this.downloadInfoBuilder.f72980t = z;
            return this;
        }

        public DownloadTask showNotification(boolean z) {
            this.downloadInfoBuilder.f72979s = z;
            return this;
        }

        public DownloadTask showNotificationForAutoResumed(boolean z) {
            this.downloadInfoBuilder.f72984x = z;
            return this;
        }

        public DownloadTask taskKey(String str) {
            this.downloadInfoBuilder.f72960Z = str;
            return this;
        }

        public DownloadTask tempPath(String str) {
            this.downloadInfoBuilder.f72965e = str;
            return this;
        }

        public DownloadTask throttleNetSpeed(long j) {
            this.downloadInfoBuilder.f72947M = j;
            return this;
        }

        public DownloadTask title(String str) {
            this.downloadInfoBuilder.f72962b = str;
            return this;
        }

        public DownloadTask ttnetProtectTimeout(long j) {
            this.downloadInfoBuilder.f72957W = j;
            return this;
        }

        public DownloadTask url(String str) {
            this.downloadInfoBuilder.f72963c = str;
            return this;
        }

        public void asyncDownload(final AbstractC30426r rVar) {
            C30518d.f72814a.execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.model.DownloadTask.RunnableC305861 */

                static {
                    Covode.recordClassIndex(37117);
                }

                public final void run() {
                    DownloadTask.this.download();
                }
            });
        }

        public IDownloadListener getSingleDownloadListener(EnumC30294h hVar) {
            return this.singleListenerMap.get(hVar);
        }

        public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public int getDownloadListenerSize(EnumC30294h hVar) {
            int size;
            MethodCollector.m26663i(7082);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                MethodCollector.m26664o(7082);
                return 0;
            }
            synchronized (downloadListeners) {
                try {
                    size = downloadListeners.size();
                } finally {
                    MethodCollector.m26664o(7082);
                }
            }
            return size;
        }

        public SparseArray<IDownloadListener> getDownloadListeners(EnumC30294h hVar) {
            if (hVar == EnumC30294h.MAIN) {
                return this.mainThreadListeners;
            }
            if (hVar == EnumC30294h.SUB) {
                return this.subThreadListeners;
            }
            if (hVar == EnumC30294h.NOTIFICATION) {
                return this.notificationListeners;
            }
            return null;
        }

        public DownloadTask setDownloadCompleteHandlers(List<AbstractC30369k> list) {
            if (list != null && !list.isEmpty()) {
                for (AbstractC30369k kVar : list) {
                    addDownloadCompleteHandler(kVar);
                }
            }
            return this;
        }

        private void addListenerToDownloadingSameTask(EnumC30294h hVar) {
            MethodCollector.m26663i(7079);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            synchronized (downloadListeners) {
                for (int i = 0; i < downloadListeners.size(); i++) {
                    try {
                        IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                        if (iDownloadListener != null) {
                            C30405d.m61749a().mo54055b(getDownloadId(), iDownloadListener, hVar, false);
                        }
                    } finally {
                        MethodCollector.m26664o(7079);
                    }
                }
            }
        }

        public DownloadTask addDownloadCompleteHandler(AbstractC30369k kVar) {
            MethodCollector.m26663i(7856);
            synchronized (this.downloadCompleteHandlers) {
                if (kVar != null) {
                    try {
                        if (!this.downloadCompleteHandlers.contains(kVar)) {
                            this.downloadCompleteHandlers.add(kVar);
                            return this;
                        }
                    } finally {
                        MethodCollector.m26664o(7856);
                    }
                }
                MethodCollector.m26664o(7856);
                return this;
            }
        }

        public AbstractC30369k getDownloadCompleteHandlerByIndex(int i) {
            MethodCollector.m26663i(7854);
            synchronized (this.downloadCompleteHandlers) {
                try {
                    if (i < this.downloadCompleteHandlers.size()) {
                        return this.downloadCompleteHandlers.get(i);
                    }
                    MethodCollector.m26664o(7854);
                    return null;
                } finally {
                    MethodCollector.m26664o(7854);
                }
            }
        }

        public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
            MethodCollector.m26663i(7710);
            this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
            this.chunkStrategy = downloadTask.chunkStrategy;
            this.singleListenerMap.clear();
            this.singleListenerMap.putAll(downloadTask.singleListenerMap);
            synchronized (this.mainThreadListeners) {
                try {
                    this.mainThreadListeners.clear();
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                } finally {
                    MethodCollector.m26664o(7710);
                }
            }
            synchronized (this.subThreadListeners) {
                try {
                    this.subThreadListeners.clear();
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                } finally {
                    MethodCollector.m26664o(7710);
                }
            }
            synchronized (this.notificationListeners) {
                try {
                    this.notificationListeners.clear();
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                } finally {
                    MethodCollector.m26664o(7710);
                }
            }
            this.notificationEventListener = downloadTask.notificationEventListener;
            this.interceptor = downloadTask.interceptor;
            this.depend = downloadTask.depend;
            this.monitorDepend = downloadTask.monitorDepend;
            this.forbiddenHandler = downloadTask.forbiddenHandler;
            this.diskSpaceHandler = downloadTask.diskSpaceHandler;
            this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
            this.notificationClickCallback = downloadTask.notificationClickCallback;
            this.fileUriProvider = downloadTask.fileUriProvider;
            synchronized (this.downloadCompleteHandlers) {
                try {
                    this.downloadCompleteHandlers.clear();
                    this.downloadCompleteHandlers.addAll(downloadTask.downloadCompleteHandlers);
                } finally {
                    MethodCollector.m26664o(7710);
                }
            }
        }

        public void copyListenerFromPendingTask(DownloadTask downloadTask) {
            MethodCollector.m26663i(7712);
            for (Map.Entry<EnumC30294h, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
                if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                    this.singleListenerMap.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                if (downloadTask.mainThreadListeners.size() != 0) {
                    synchronized (this.mainThreadListeners) {
                        try {
                            removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(7712);
                            throw th;
                        }
                    }
                }
                if (downloadTask.subThreadListeners.size() != 0) {
                    synchronized (this.subThreadListeners) {
                        try {
                            removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(7712);
                            throw th2;
                        }
                    }
                }
                if (downloadTask.notificationListeners.size() != 0) {
                    synchronized (this.notificationListeners) {
                        try {
                            removeAll(this.notificationListeners, downloadTask.notificationListeners);
                            addAll(downloadTask.notificationListeners, this.notificationListeners);
                        } finally {
                            MethodCollector.m26664o(7712);
                        }
                    }
                    return;
                }
                MethodCollector.m26664o(7712);
            } catch (Throwable unused) {
                MethodCollector.m26664o(7712);
            }
        }

        private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
            if (!(sparseArray == null || sparseArray2 == null)) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    sparseArray2.put(keyAt, sparseArray.get(keyAt));
                }
            }
        }

        private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
            sparseArray.clear();
            for (int i = 0; i < sparseArray2.size(); i++) {
                int keyAt = sparseArray2.keyAt(i);
                IDownloadListener iDownloadListener = sparseArray2.get(keyAt);
                if (iDownloadListener != null) {
                    sparseArray.put(keyAt, iDownloadListener);
                }
            }
        }

        private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
            if (!(sparseArray == null || sparseArray2 == null)) {
                int size = sparseArray2.size();
                for (int i = 0; i < size; i++) {
                    sparseArray.remove(sparseArray2.keyAt(i));
                }
            }
        }

        public IDownloadListener getDownloadListenerByIndex(EnumC30294h hVar, int i) {
            MethodCollector.m26663i(7228);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null || i < 0) {
                MethodCollector.m26664o(7228);
                return null;
            }
            synchronized (downloadListeners) {
                try {
                    if (i < downloadListeners.size()) {
                        return downloadListeners.get(downloadListeners.keyAt(i));
                    }
                    MethodCollector.m26664o(7228);
                    return null;
                } finally {
                    MethodCollector.m26664o(7228);
                }
            }
        }

        public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
            MethodCollector.m26663i(8460);
            if (iDownloadListener != null) {
                synchronized (this.mainThreadListeners) {
                    try {
                        this.mainThreadListeners.put(i, iDownloadListener);
                    } finally {
                        MethodCollector.m26664o(8460);
                    }
                }
                this.singleListenerMap.put(EnumC30294h.MAIN, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i, EnumC30294h.MAIN);
                    } finally {
                        MethodCollector.m26664o(8460);
                    }
                }
            }
            return this;
        }

        public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
            MethodCollector.m26663i(8614);
            if (iDownloadListener != null) {
                synchronized (this.notificationListeners) {
                    try {
                        this.notificationListeners.put(i, iDownloadListener);
                    } finally {
                        MethodCollector.m26664o(8614);
                    }
                }
                this.singleListenerMap.put(EnumC30294h.NOTIFICATION, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i, EnumC30294h.NOTIFICATION);
                    } finally {
                        MethodCollector.m26664o(8614);
                    }
                }
            }
            return this;
        }

        public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
            MethodCollector.m26663i(8611);
            if (iDownloadListener != null) {
                synchronized (this.subThreadListeners) {
                    try {
                        this.subThreadListeners.put(i, iDownloadListener);
                    } finally {
                        MethodCollector.m26664o(8611);
                    }
                }
                this.singleListenerMap.put(EnumC30294h.SUB, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i, EnumC30294h.SUB);
                    } finally {
                        MethodCollector.m26664o(8611);
                    }
                }
            }
            return this;
        }

        public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, EnumC30294h hVar) {
            MethodCollector.m26663i(7532);
            if (sparseArray == null) {
                MethodCollector.m26664o(7532);
                return;
            }
            try {
                if (hVar == EnumC30294h.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        try {
                            copyListeners(this.mainThreadListeners, sparseArray);
                        } finally {
                            MethodCollector.m26664o(7532);
                        }
                    }
                } else if (hVar == EnumC30294h.SUB) {
                    synchronized (this.subThreadListeners) {
                        try {
                            copyListeners(this.subThreadListeners, sparseArray);
                        } finally {
                            MethodCollector.m26664o(7532);
                        }
                    }
                } else if (hVar == EnumC30294h.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        try {
                            copyListeners(this.notificationListeners, sparseArray);
                        } finally {
                            MethodCollector.m26664o(7532);
                        }
                    }
                } else {
                    MethodCollector.m26664o(7532);
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(7532);
            }
        }

        public void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
            Map<EnumC30294h, IDownloadListener> map;
            MethodCollector.m26663i(7378);
            if (iDownloadListener == null) {
                MethodCollector.m26664o(7378);
                return;
            }
            if (z && (map = this.singleListenerMap) != null) {
                map.put(hVar, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i, hVar);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7378);
                        throw th;
                    }
                }
            }
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                MethodCollector.m26664o(7378);
                return;
            }
            synchronized (downloadListeners) {
                try {
                    downloadListeners.put(i, iDownloadListener);
                } finally {
                    MethodCollector.m26664o(7378);
                }
            }
        }

        public void removeDownloadListener(int i, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
            int indexOfValue;
            MethodCollector.m26663i(7375);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                if (z && this.singleListenerMap.containsKey(hVar)) {
                    this.singleListenerMap.remove(hVar);
                }
                MethodCollector.m26664o(7375);
                return;
            }
            synchronized (downloadListeners) {
                if (z) {
                    try {
                        if (this.singleListenerMap.containsKey(hVar)) {
                            iDownloadListener = this.singleListenerMap.get(hVar);
                            this.singleListenerMap.remove(hVar);
                        }
                        if (iDownloadListener != null && (indexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && indexOfValue < downloadListeners.size()) {
                            downloadListeners.removeAt(indexOfValue);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7375);
                        throw th;
                    }
                } else {
                    downloadListeners.remove(i);
                    synchronized (this.singleListenerHashCodeMap) {
                        try {
                            EnumC30294h hVar2 = this.singleListenerHashCodeMap.get(i);
                            if (hVar2 != null && this.singleListenerMap.containsKey(hVar2)) {
                                this.singleListenerMap.remove(hVar2);
                                this.singleListenerHashCodeMap.remove(i);
                            }
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(7375);
                            throw th2;
                        }
                    }
                }
            }
            MethodCollector.m26664o(7375);
        }
    }
