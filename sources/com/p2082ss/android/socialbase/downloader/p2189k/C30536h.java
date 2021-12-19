package com.p2082ss.android.socialbase.downloader.p2189k;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30338ad;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30346b;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30347c;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30350d;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30356f;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30370l;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30373m;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30376n;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30377o;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30378p;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30383s;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30386t;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30387u;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30388v;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30416j;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.AbstractC30589a;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.k.h */
public final class C30536h {

    /* renamed from: a */
    public static Handler f72850a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static AbstractC30589a m62624a(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new AbstractC30589a.AbstractBinderC30590a() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305371 */

            static {
                Covode.recordClassIndex(37065);
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final DownloadInfo mo54368a() {
                return downloadTask.getDownloadInfo();
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: b */
            public final AbstractC30347c mo54369b() {
                AbstractC30416j chunkStrategy = downloadTask.getChunkStrategy();
                if (chunkStrategy == null) {
                    return null;
                }
                return new AbstractC30347c.AbstractBinderC30348a(chunkStrategy) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305755 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30416j f72905a;

                    static {
                        Covode.recordClassIndex(37103);
                    }

                    {
                        this.f72905a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30347c
                    /* renamed from: a */
                    public final int mo53879a(long j) {
                        return this.f72905a.mo54081a(j);
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: d */
            public final AbstractC30334ab mo54373d() {
                return C30536h.m62616a(downloadTask.getNotificationClickCallback());
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: e */
            public final AbstractC30356f mo54374e() {
                AbstractC30388v interceptor = downloadTask.getInterceptor();
                if (interceptor == null) {
                    return null;
                }
                return new AbstractC30356f.AbstractBinderC30357a(interceptor) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305766 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30388v f72906a;

                    static {
                        Covode.recordClassIndex(37104);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30356f
                    /* renamed from: a */
                    public final boolean mo53891a() {
                        return this.f72906a.mo53946a();
                    }

                    {
                        this.f72906a = r1;
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: f */
            public final AbstractC30350d mo54375f() {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend == null) {
                    return null;
                }
                return new AbstractC30350d.AbstractBinderC30351a(depend) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305713 */

                    /* renamed from: a */
                    final /* synthetic */ IDownloadDepend f72901a;

                    static {
                        Covode.recordClassIndex(37099);
                    }

                    {
                        this.f72901a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30350d
                    /* renamed from: a */
                    public final void mo53883a(DownloadInfo downloadInfo, BaseException baseException, int i) {
                        this.f72901a.monitorLogSend(downloadInfo, baseException, i);
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: g */
            public final AbstractC30383s mo54376g() {
                AbstractC30387u forbiddenHandler = downloadTask.getForbiddenHandler();
                if (forbiddenHandler == null) {
                    return null;
                }
                return new AbstractC30383s.AbstractBinderC30384a(forbiddenHandler) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3056928 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30387u f72899a;

                    static {
                        Covode.recordClassIndex(37097);
                    }

                    {
                        this.f72899a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30383s
                    /* renamed from: a */
                    public final boolean mo53941a(AbstractC30380r rVar) {
                        C3057230 r0;
                        AbstractC30387u uVar = this.f72899a;
                        if (rVar == null) {
                            r0 = null;
                        } else {
                            r0 = new AbstractC30386t(rVar) {
                                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3057230 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC30380r f72902a;

                                static {
                                    Covode.recordClassIndex(37100);
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30386t
                                /* renamed from: a */
                                public final boolean mo53857a() {
                                    try {
                                        return this.f72902a.mo53937a();
                                    } catch (RemoteException e) {
                                        e.printStackTrace();
                                        return false;
                                    }
                                }

                                {
                                    this.f72902a = r1;
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30386t
                                /* renamed from: a */
                                public final void mo53856a(List<String> list) {
                                    try {
                                        this.f72902a.mo53936a(list);
                                    } catch (RemoteException e) {
                                        e.printStackTrace();
                                    }
                                }
                            };
                        }
                        return uVar.mo53945a(r0);
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: h */
            public final AbstractC30338ad mo54377h() {
                AbstractC30429u retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
                if (retryDelayTimeCalculator == null) {
                    return null;
                }
                return new AbstractC30338ad.AbstractBinderC30339a(retryDelayTimeCalculator) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3056827 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30429u f72898a;

                    static {
                        Covode.recordClassIndex(37096);
                    }

                    {
                        this.f72898a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30338ad
                    /* renamed from: a */
                    public final long mo53867a(int i, int i2) {
                        return this.f72898a.mo54207a(i, i2);
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: i */
            public final AbstractC30373m mo54378i() {
                AbstractC30377o diskSpaceHandler = downloadTask.getDiskSpaceHandler();
                if (diskSpaceHandler == null) {
                    return null;
                }
                return new AbstractC30373m.AbstractBinderC30374a(diskSpaceHandler) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3057331 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30377o f72903a;

                    static {
                        Covode.recordClassIndex(37101);
                    }

                    {
                        this.f72903a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30373m
                    /* renamed from: a */
                    public final boolean mo53928a(long j, long j2, AbstractC30370l lVar) {
                        C305602 r5;
                        AbstractC30377o oVar = this.f72903a;
                        if (lVar == null) {
                            r5 = null;
                        } else {
                            r5 = new AbstractC30376n(lVar) {
                                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C305602 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC30370l f72890a;

                                static {
                                    Covode.recordClassIndex(37088);
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30376n
                                /* renamed from: a */
                                public final void mo53932a() {
                                    try {
                                        this.f72890a.mo53924a();
                                    } catch (RemoteException e) {
                                        e.printStackTrace();
                                    }
                                }

                                {
                                    this.f72890a = r1;
                                }
                            };
                        }
                        return oVar.mo53933a(j, j2, r5);
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: j */
            public final AbstractC30362h mo54379j() {
                AbstractC30389w monitorDepend = downloadTask.getMonitorDepend();
                if (monitorDepend == null) {
                    return null;
                }
                return new AbstractC30362h.AbstractBinderC30363a(monitorDepend) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305744 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30389w f72904a;

                    static {
                        Covode.recordClassIndex(37102);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
                    /* renamed from: a */
                    public final String mo53911a() {
                        return this.f72904a.getEventPage();
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
                    /* renamed from: b */
                    public final int[] mo53913b() {
                        AbstractC30389w wVar = this.f72904a;
                        if (wVar instanceof AbstractC30346b) {
                            return ((AbstractC30346b) wVar).mo53878a();
                        }
                        return null;
                    }

                    {
                        this.f72904a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
                    /* renamed from: a */
                    public final void mo53912a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                this.f72904a.monitorLogSend(new JSONObject(str));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: k */
            public final AbstractC30353e mo54380k() {
                return C30536h.m62618a(downloadTask.getFileUriProvider());
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: l */
            public final int mo54381l() {
                return downloadTask.getDownloadCompleteHandlers().size();
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: c */
            public final AbstractC30390x mo54372c() {
                return C30536h.m62621a(downloadTask.getNotificationEventListener());
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final int mo54366a(int i) {
                return downloadTask.getDownloadListenerSize(C30535g.m62587c(i));
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: c */
            public final AbstractC30366j mo54371c(int i) {
                AbstractC30369k downloadCompleteHandlerByIndex = downloadTask.getDownloadCompleteHandlerByIndex(i);
                if (downloadCompleteHandlerByIndex == null) {
                    return null;
                }
                return new AbstractC30366j.AbstractBinderC30367a(downloadCompleteHandlerByIndex) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC305799 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30369k f72909a;

                    static {
                        Covode.recordClassIndex(37107);
                    }

                    {
                        this.f72909a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j
                    /* renamed from: b */
                    public final boolean mo53918b(DownloadInfo downloadInfo) {
                        return this.f72909a.mo53923b(downloadInfo);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j
                    /* renamed from: a */
                    public final void mo53917a(DownloadInfo downloadInfo) {
                        try {
                            this.f72909a.mo53922a(downloadInfo);
                        } catch (BaseException e) {
                            throw new IllegalArgumentException(e);
                        }
                    }
                };
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: b */
            public final AbstractC30359g mo54370b(int i) {
                boolean z;
                IDownloadListener singleDownloadListener = downloadTask.getSingleDownloadListener(C30535g.m62587c(i));
                if (i == EnumC30294h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C30536h.m62619a(singleDownloadListener, z);
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final AbstractC30359g mo54367a(int i, int i2) {
                boolean z;
                IDownloadListener downloadListenerByIndex = downloadTask.getDownloadListenerByIndex(C30535g.m62587c(i), i2);
                if (i == EnumC30294h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C30536h.m62619a(downloadListenerByIndex, z);
            }
        };
    }

    /* renamed from: a */
    public static DownloadTask m62623a(AbstractC30589a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(aVar.mo54368a());
            final AbstractC30347c b = aVar.mo54369b();
            DownloadTask notificationEventListener = downloadTask.chunkStategy(b == null ? null : new AbstractC30416j() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3053911 */

                static {
                    Covode.recordClassIndex(37067);
                }

                @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30416j
                /* renamed from: a */
                public final int mo54081a(long j) {
                    try {
                        return b.mo53879a(j);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return 0;
                    }
                }
            }).notificationEventListener(m62622a(aVar.mo54372c()));
            final AbstractC30356f e = aVar.mo54374e();
            DownloadTask interceptor = notificationEventListener.interceptor(e == null ? null : new AbstractC30388v() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3056322 */

                static {
                    Covode.recordClassIndex(37091);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30388v
                /* renamed from: a */
                public final boolean mo53946a() {
                    try {
                        return e.mo53891a();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            });
            final AbstractC30350d f = aVar.mo54375f();
            DownloadTask depend = interceptor.depend(f == null ? null : new IDownloadDepend() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3055313 */

                static {
                    Covode.recordClassIndex(37081);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend
                public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
                    if (downloadInfo != null) {
                        try {
                            f.mo53883a(downloadInfo, baseException, i);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            final AbstractC30362h j = aVar.mo54379j();
            DownloadTask monitorDepend = depend.monitorDepend(j == null ? null : new AbstractC30346b() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3055414 */

                static {
                    Covode.recordClassIndex(37082);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30346b
                /* renamed from: a */
                public final int[] mo53878a() {
                    try {
                        return j.mo53913b();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w
                public final String getEventPage() {
                    try {
                        return j.mo53911a();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return "";
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w
                public final void monitorLogSend(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            j.mo53912a(jSONObject.toString());
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            final AbstractC30383s g = aVar.mo54376g();
            DownloadTask forbiddenHandler = monitorDepend.forbiddenHandler(g == null ? null : new AbstractC30387u() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3055515 */

                static {
                    Covode.recordClassIndex(37083);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30387u
                /* renamed from: a */
                public final boolean mo53945a(AbstractC30386t tVar) {
                    BinderC3055616 r0;
                    try {
                        AbstractC30383s sVar = g;
                        if (tVar == null) {
                            r0 = null;
                        } else {
                            r0 = new AbstractC30380r.AbstractBinderC30381a(tVar) {
                                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3055616 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC30386t f72886a;

                                static {
                                    Covode.recordClassIndex(37084);
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r
                                /* renamed from: a */
                                public final boolean mo53937a() {
                                    return this.f72886a.mo53857a();
                                }

                                {
                                    this.f72886a = r1;
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r
                                /* renamed from: a */
                                public final void mo53936a(List<String> list) {
                                    this.f72886a.mo53856a(list);
                                }
                            };
                        }
                        return sVar.mo53941a(r0);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            });
            final AbstractC30373m i = aVar.mo54378i();
            DownloadTask notificationClickCallback = forbiddenHandler.diskSpaceHandler(i == null ? null : new AbstractC30377o() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3055919 */

                static {
                    Covode.recordClassIndex(37087);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30377o
                /* renamed from: a */
                public final boolean mo53933a(long j, long j2, AbstractC30376n nVar) {
                    BinderC3056120 r5;
                    try {
                        AbstractC30373m mVar = i;
                        if (nVar == null) {
                            r5 = null;
                        } else {
                            r5 = new AbstractC30370l.AbstractBinderC30371a(nVar) {
                                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3056120 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC30376n f72891a;

                                static {
                                    Covode.recordClassIndex(37089);
                                }

                                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30370l
                                /* renamed from: a */
                                public final void mo53924a() {
                                    this.f72891a.mo53932a();
                                }

                                {
                                    this.f72891a = r1;
                                }
                            };
                        }
                        return mVar.mo53928a(j, j2, r5);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            }).fileUriProvider(m62620a(aVar.mo54380k())).notificationClickCallback(m62617a(aVar.mo54373d()));
            final AbstractC30338ad h = aVar.mo54377h();
            notificationClickCallback.retryDelayTimeCalculator(h == null ? null : new AbstractC30429u() {
                /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3056221 */

                static {
                    Covode.recordClassIndex(37090);
                }

                @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u
                /* renamed from: a */
                public final long mo54207a(int i, int i2) {
                    try {
                        return h.mo53867a(i, i2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return 0;
                    }
                }
            });
            AbstractC30359g b2 = aVar.mo54370b(EnumC30294h.MAIN.ordinal());
            if (b2 != null) {
                downloadTask.mainThreadListenerWithHashCode(b2.hashCode(), m62615a(b2));
            }
            AbstractC30359g b3 = aVar.mo54370b(EnumC30294h.SUB.ordinal());
            if (b3 != null) {
                downloadTask.subThreadListenerWithHashCode(b3.hashCode(), m62615a(b3));
            }
            AbstractC30359g b4 = aVar.mo54370b(EnumC30294h.NOTIFICATION.ordinal());
            if (b4 != null) {
                downloadTask.notificationListenerWithHashCode(b4.hashCode(), m62615a(b4));
            }
            m62625a(downloadTask, aVar, EnumC30294h.MAIN);
            m62625a(downloadTask, aVar, EnumC30294h.SUB);
            m62625a(downloadTask, aVar, EnumC30294h.NOTIFICATION);
            for (int i2 = 0; i2 < aVar.mo54381l(); i2++) {
                final AbstractC30366j c = aVar.mo54371c(i2);
                if (c != null) {
                    downloadTask.addDownloadCompleteHandler(new AbstractC30369k() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C305788 */

                        static {
                            Covode.recordClassIndex(37106);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k
                        /* renamed from: a */
                        public final void mo53922a(DownloadInfo downloadInfo) {
                            try {
                                c.mo53917a(downloadInfo);
                            } catch (RemoteException e) {
                                throw new BaseException(1008, e);
                            }
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k
                        /* renamed from: b */
                        public final boolean mo53923b(DownloadInfo downloadInfo) {
                            try {
                                return c.mo53918b(downloadInfo);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                                return false;
                            }
                        }
                    });
                }
            }
            return downloadTask;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static void m62625a(DownloadTask downloadTask, AbstractC30589a aVar, EnumC30294h hVar) {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i = 0; i < aVar.mo54366a(hVar.ordinal()); i++) {
            AbstractC30359g a = aVar.mo54367a(hVar.ordinal(), i);
            if (a != null) {
                sparseArray.put(a.mo53895a(), m62615a(a));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, hVar);
    }

    static {
        Covode.recordClassIndex(37064);
    }

    /* renamed from: a */
    public static IDownloadListener m62615a(final AbstractC30359g gVar) {
        if (gVar == null) {
            return null;
        }
        return new AbstractC30378p() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3056625 */

            static {
                Covode.recordClassIndex(37094);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30378p
            /* renamed from: a */
            public final void mo53934a(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53907i(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53904f(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53905g(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53906h(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53902d(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53896a(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53900c(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53898b(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    gVar.mo53903e(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo53897a(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo53899b(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo53901c(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30334ab m62616a(final AbstractC30337ac acVar) {
        if (acVar == null) {
            return null;
        }
        return new AbstractC30334ab.AbstractBinderC30335a() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3056726 */

            static {
                Covode.recordClassIndex(37095);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: a */
            public final boolean mo53858a(DownloadInfo downloadInfo) {
                return acVar.mo53864a(downloadInfo);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: b */
            public final boolean mo53859b(DownloadInfo downloadInfo) {
                return acVar.mo53865b(downloadInfo);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: c */
            public final boolean mo53860c(DownloadInfo downloadInfo) {
                return acVar.mo53866c(downloadInfo);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30337ac m62617a(final AbstractC30334ab abVar) {
        if (abVar == null) {
            return null;
        }
        return new AbstractC30337ac() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3053810 */

            static {
                Covode.recordClassIndex(37066);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac
            /* renamed from: a */
            public final boolean mo53864a(DownloadInfo downloadInfo) {
                try {
                    return abVar.mo53858a(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac
            /* renamed from: b */
            public final boolean mo53865b(DownloadInfo downloadInfo) {
                try {
                    return abVar.mo53859b(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac
            /* renamed from: c */
            public final boolean mo53866c(DownloadInfo downloadInfo) {
                try {
                    return abVar.mo53860c(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30353e m62618a(final AbstractC30379q qVar) {
        if (qVar == null) {
            return null;
        }
        return new AbstractC30353e.AbstractBinderC30354a() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3057029 */

            static {
                Covode.recordClassIndex(37098);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e
            /* renamed from: a */
            public final Uri mo53887a(String str, String str2) {
                return qVar.mo53935a(str, str2);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30379q m62620a(final AbstractC30353e eVar) {
        if (eVar == null) {
            return null;
        }
        return new AbstractC30379q() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3056524 */

            static {
                Covode.recordClassIndex(37093);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q
            /* renamed from: a */
            public final Uri mo53935a(String str, String str2) {
                try {
                    return eVar.mo53887a(str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30390x m62621a(final AbstractC30393y yVar) {
        if (yVar == null) {
            return null;
        }
        return new AbstractC30390x.AbstractBinderC30391a() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3056423 */

            static {
                Covode.recordClassIndex(37092);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final String mo53949a() {
                return yVar.mo53955a();
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final boolean mo53951a(boolean z) {
                return yVar.mo53957a(z);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final void mo53950a(int i, DownloadInfo downloadInfo, String str, String str2) {
                yVar.mo53956a(i, downloadInfo, str, str2);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30393y m62622a(final AbstractC30390x xVar) {
        if (xVar == null) {
            return null;
        }
        return new AbstractC30393y() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C305777 */

            static {
                Covode.recordClassIndex(37105);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y
            /* renamed from: a */
            public final String mo53955a() {
                try {
                    return xVar.mo53949a();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y
            /* renamed from: a */
            public final boolean mo53957a(boolean z) {
                try {
                    return xVar.mo53951a(z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y
            /* renamed from: a */
            public final void mo53956a(int i, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    xVar.mo53950a(i, downloadInfo, str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC30359g m62619a(final IDownloadListener iDownloadListener, final boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new AbstractC30359g.AbstractBinderC30360a() {
            /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012 */

            static {
                Covode.recordClassIndex(37068);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final int mo53895a() {
                return iDownloadListener.hashCode();
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final void mo53896a(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305411 */

                        static {
                            Covode.recordClassIndex(37069);
                        }

                        public final void run() {
                            iDownloadListener.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPrepare(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: b */
            public final void mo53898b(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305485 */

                        static {
                            Covode.recordClassIndex(37076);
                        }

                        public final void run() {
                            iDownloadListener.onStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onStart(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: c */
            public final void mo53900c(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305496 */

                        static {
                            Covode.recordClassIndex(37077);
                        }

                        public final void run() {
                            iDownloadListener.onProgress(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onProgress(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: d */
            public final void mo53902d(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305507 */

                        static {
                            Covode.recordClassIndex(37078);
                        }

                        public final void run() {
                            iDownloadListener.onPause(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPause(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: e */
            public final void mo53903e(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305518 */

                        static {
                            Covode.recordClassIndex(37079);
                        }

                        public final void run() {
                            iDownloadListener.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onSuccessed(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: f */
            public final void mo53904f(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC3054210 */

                        static {
                            Covode.recordClassIndex(37070);
                        }

                        public final void run() {
                            iDownloadListener.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onCanceled(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: g */
            public final void mo53905g(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC3054311 */

                        static {
                            Covode.recordClassIndex(37071);
                        }

                        public final void run() {
                            iDownloadListener.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstStart(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: h */
            public final void mo53906h(final DownloadInfo downloadInfo) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC3054412 */

                        static {
                            Covode.recordClassIndex(37072);
                        }

                        public final void run() {
                            iDownloadListener.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstSuccess(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: i */
            public final void mo53907i(final DownloadInfo downloadInfo) {
                IDownloadListener iDownloadListener = iDownloadListener;
                if (!(iDownloadListener instanceof AbstractC30378p)) {
                    return;
                }
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305474 */

                        static {
                            Covode.recordClassIndex(37075);
                        }

                        public final void run() {
                            ((AbstractC30378p) iDownloadListener).mo53934a(downloadInfo);
                        }
                    });
                } else {
                    ((AbstractC30378p) iDownloadListener).mo53934a(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final void mo53897a(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305529 */

                        static {
                            Covode.recordClassIndex(37080);
                        }

                        public final void run() {
                            iDownloadListener.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onFailed(downloadInfo, baseException);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: b */
            public final void mo53899b(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305452 */

                        static {
                            Covode.recordClassIndex(37073);
                        }

                        public final void run() {
                            iDownloadListener.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetry(downloadInfo, baseException);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: c */
            public final void mo53901c(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    C30536h.f72850a.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3054012.RunnableC305463 */

                        static {
                            Covode.recordClassIndex(37074);
                        }

                        public final void run() {
                            iDownloadListener.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                }
            }
        };
    }
}
