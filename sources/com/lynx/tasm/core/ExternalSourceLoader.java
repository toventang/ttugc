package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.component.AbstractC28735a;
import com.lynx.tasm.provider.AbstractC28849g;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.C28851i;
import com.lynx.tasm.provider.C28852j;
import com.lynx.tasm.utils.C28929m;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExternalSourceLoader {

    /* renamed from: a */
    public final WeakReference<LynxTemplateRender> f67759a;

    /* renamed from: b */
    public WeakReference<JSProxy> f67760b;

    /* renamed from: c */
    private final AbstractC28850h f67761c;

    /* renamed from: d */
    private final AbstractC28850h f67762d;

    /* renamed from: e */
    private final AbstractC28735a f67763e;

    static {
        Covode.recordClassIndex(34832);
    }

    /* renamed from: com.lynx.tasm.core.ExternalSourceLoader$a */
    static class CallableC28743a implements Callable<byte[]> {

        /* renamed from: a */
        public byte[] f67783a;

        static {
            Covode.recordClassIndex(34839);
        }

        private CallableC28743a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ byte[] call() {
            return this.f67783a;
        }

        /* synthetic */ CallableC28743a(byte b) {
            this();
        }
    }

    private byte[] loadExternalSource(String str) {
        byte[] bArr;
        if (this.f67761c == null) {
            return null;
        }
        C28851i iVar = new C28851i(str);
        final CallableC28743a aVar = new CallableC28743a((byte) 0);
        final FutureTask futureTask = new FutureTask(aVar);
        this.f67761c.mo33453a(iVar, new AbstractC28849g<byte[]>() {
            /* class com.lynx.tasm.core.ExternalSourceLoader.C287371 */

            static {
                Covode.recordClassIndex(34833);
            }

            @Override // com.lynx.tasm.provider.AbstractC28849g
            /* renamed from: a */
            public final void mo48809a(C28852j<byte[]> jVar) {
                super.mo48809a(jVar);
                if (jVar.mo49982a()) {
                    LLog.m56856a(4, "ExternalSourceLoader", "loadExternalSource onSuccess.");
                    aVar.f67783a = (byte[]) jVar.f68100c;
                    futureTask.run();
                    return;
                }
                futureTask.run();
                ExternalSourceLoader.this.mo49851a(1701, "ExternalSourceLoader loadExternalSource request failed, error:" + jVar.f68098a);
            }
        });
        try {
            bArr = (byte[]) futureTask.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo49851a(1701, "ExternalSourceLoader loadExternalSource request failed, error:".concat(String.valueOf(e)));
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        mo49851a(1701, "ExternalSourceLoader loadExternalSource failed, get null data for provider");
        return null;
    }

    /* renamed from: a */
    public final void mo49851a(final int i, final String str) {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.core.ExternalSourceLoader.RunnableC287415 */

            static {
                Covode.recordClassIndex(34837);
            }

            public final void run() {
                LynxTemplateRender lynxTemplateRender = ExternalSourceLoader.this.f67759a.get();
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.onErrorOccurred(i, str);
                }
            }
        });
    }

    private void loadExternalSourceAsync(final String str, final int i) {
        if (this.f67761c != null) {
            this.f67761c.mo33453a(new C28851i(str), new AbstractC28849g<byte[]>() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.C287382 */

                static {
                    Covode.recordClassIndex(34834);
                }

                @Override // com.lynx.tasm.provider.AbstractC28849g
                /* renamed from: a */
                public final void mo48809a(C28852j<byte[]> jVar) {
                    MethodCollector.m26663i(2045);
                    super.mo48809a(jVar);
                    if (jVar.mo49982a()) {
                        LLog.m56856a(4, "ExternalSourceLoader", "loadExternalSourceAsync onSuccess.");
                        byte[] bArr = (byte[]) jVar.f68100c;
                        if (bArr == null || bArr.length == 0) {
                            ExternalSourceLoader.this.mo49851a(1701, "ExternalSourceLoader loadExternalSourceAsync failed, get null data for provider");
                            MethodCollector.m26664o(2045);
                            return;
                        }
                        JSProxy jSProxy = ExternalSourceLoader.this.f67760b.get();
                        if (jSProxy != null) {
                            String str = str;
                            int i = i;
                            jSProxy.f67787d.readLock().lock();
                            if (jSProxy.f67784a != 0) {
                                JSProxy.nativeEvaluateScript(jSProxy.f67784a, str, bArr, i);
                            }
                            jSProxy.f67787d.readLock().unlock();
                        }
                        MethodCollector.m26664o(2045);
                        return;
                    }
                    ExternalSourceLoader.this.mo49851a(1701, "ExternalSourceLoader loadExternalSourceAsync request failed, error:" + jVar.f68098a);
                    MethodCollector.m26664o(2045);
                }
            });
        }
    }

    private void loadDynamicComponentAsync(final String str, final int i) {
        if (this.f67762d != null) {
            this.f67762d.mo33453a(new C28851i(str), new AbstractC28849g<byte[]>() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.C287393 */

                static {
                    Covode.recordClassIndex(34835);
                }

                @Override // com.lynx.tasm.provider.AbstractC28849g
                /* renamed from: a */
                public final void mo48809a(C28852j<byte[]> jVar) {
                    String str;
                    super.mo48809a(jVar);
                    ExternalSourceLoader externalSourceLoader = ExternalSourceLoader.this;
                    String str2 = str;
                    int i = i;
                    byte[] bArr = (byte[]) jVar.f68100c;
                    if (jVar.f68098a != null) {
                        str = jVar.f68098a.getMessage();
                    } else {
                        str = null;
                    }
                    externalSourceLoader.mo49852a(str2, i, bArr, str);
                }
            });
            return;
        }
        AbstractC28735a aVar = this.f67763e;
        if (aVar != null) {
            aVar.mo33445a(str, new AbstractC28735a.AbstractC28736a() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.C287404 */

                static {
                    Covode.recordClassIndex(34836);
                }

                @Override // com.lynx.tasm.component.AbstractC28735a.AbstractC28736a
                /* renamed from: a */
                public final void mo49849a(byte[] bArr, Throwable th) {
                    String str;
                    ExternalSourceLoader externalSourceLoader = ExternalSourceLoader.this;
                    String str2 = str;
                    int i = i;
                    if (th != null) {
                        str = th.getMessage();
                    } else {
                        str = null;
                    }
                    externalSourceLoader.mo49852a(str2, i, bArr, str);
                }
            });
        } else {
            mo49852a(str, i, null, "ExternalSourceLoader Load dynamic component failed, since there is no provider or fetcher.");
        }
    }

    public ExternalSourceLoader(AbstractC28850h hVar, AbstractC28850h hVar2, AbstractC28735a aVar, LynxTemplateRender lynxTemplateRender) {
        this.f67761c = hVar;
        this.f67762d = hVar2;
        this.f67763e = aVar;
        this.f67759a = new WeakReference<>(lynxTemplateRender);
    }

    /* renamed from: a */
    public final void mo49852a(final String str, final int i, final byte[] bArr, String str2) {
        String str3;
        int i2;
        if (str2 != null) {
            str3 = "ExternalSourceLoader Load dynamic component failed, the url is " + str + ", and the error message is " + str2;
            i2 = 1601;
        } else if (bArr == null || bArr.length == 0) {
            str3 = "ExternalSourceLoader The dynamic component's binary template is empty, the url is ".concat(String.valueOf(str));
            i2 = 1602;
        } else {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.RunnableC287426 */

                static {
                    Covode.recordClassIndex(34838);
                }

                public final void run() {
                    LynxTemplateRender lynxTemplateRender = ExternalSourceLoader.this.f67759a.get();
                    if (lynxTemplateRender != null) {
                        lynxTemplateRender.loadComponent(str, bArr, i);
                    }
                }
            });
            return;
        }
        mo49851a(i2, str3);
        JSProxy jSProxy = this.f67760b.get();
        if (jSProxy != null) {
            jSProxy.mo49860a(str, i, i2, str3);
        }
    }
}
