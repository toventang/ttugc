package com.bytedance.creativex.recorder.p938a;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p036g.AbstractC0688a;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.creativex.recorder.a.a */
public abstract class AbstractC14095a {

    /* renamed from: a */
    public final AbstractC78054d f34286a;

    /* renamed from: b */
    public final AbstractC78051c f34287b;

    /* renamed from: c */
    public List<BeautyComposerInfo> f34288c;

    /* renamed from: d */
    public AbstractC1204m f34289d;

    /* renamed from: e */
    private boolean f34290e;

    /* renamed from: f */
    private final AbstractC84903j f34291f;

    /* renamed from: g */
    private final AbstractC14210a f34292g;

    /* renamed from: h */
    private boolean f34293h;

    static {
        Covode.recordClassIndex(16164);
    }

    /* renamed from: a */
    public abstract BeautyMetadata mo22643a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22647b(AbstractC1204m mVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22644a(AbstractC0688a<AbstractC84903j> aVar) {
        AbstractC84903j jVar = this.f34291f;
        if (jVar != null) {
            aVar.mo2720a(jVar);
        }
    }

    /* renamed from: a */
    public final void mo22645a(AbstractC1204m mVar) {
        if (!this.f34287b.mo121768a()) {
            return;
        }
        if (!this.f34290e) {
            this.f34287b.mo121767a(false, EnumC77817a.CUR);
            this.f34289d = mVar;
            if (this.f34287b.mo121768a()) {
                this.f34287b.mo121771d().mo70310a(mVar, new AbstractC1214u<List<BeautyComposerInfo>>() {
                    /* class com.bytedance.creativex.recorder.p938a.AbstractC14095a.C140961 */

                    static {
                        Covode.recordClassIndex(16165);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(List<BeautyComposerInfo> list) {
                        AbstractC14095a.this.f34288c = list;
                        AbstractC14095a.this.mo22646a(true);
                    }
                });
                this.f34287b.mo121772e().mo70310a(mVar, new C14105b(this));
            }
            this.f34290e = true;
            return;
        }
        this.f34287b.mo121770c();
    }

    /* renamed from: a */
    public final void mo22646a(final boolean z) {
        C14215e eVar;
        try {
            if (this.f34287b.mo121769b().equals("record")) {
                this.f34286a.mo22682e(false);
                if (this.f34288c == null) {
                    this.f34288c = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (BeautyComposerInfo beautyComposerInfo : this.f34288c) {
                    arrayList.add(beautyComposerInfo.f96060a);
                    arrayList2.add(beautyComposerInfo.f96061b);
                    mo22644a(new C14106c(beautyComposerInfo));
                }
                int indexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
                AbstractC14210a aVar = this.f34292g;
                if (aVar == null) {
                    eVar = null;
                } else {
                    eVar = aVar.getCurrentFilterSource().getValue();
                }
                if (indexOf >= 0 && indexOf < this.f34288c.size() && (eVar == null || !this.f34292g.isFilterDisable(eVar.f34497a))) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 0; i < indexOf; i++) {
                        arrayList3.add(this.f34288c.get(i));
                    }
                    final ArrayList arrayList4 = new ArrayList();
                    while (true) {
                        indexOf++;
                        if (indexOf >= this.f34288c.size()) {
                            break;
                        }
                        arrayList4.add(this.f34288c.get(indexOf));
                    }
                    if (this.f34287b.mo121773f()) {
                        if (this.f34293h) {
                            this.f34286a.mo22679b(arrayList3, 10000);
                        } else {
                            this.f34286a.mo22675a(arrayList3, 10000);
                        }
                    } else if (this.f34293h) {
                        this.f34286a.mo22679b(Collections.emptyList(), 10000);
                    } else {
                        this.f34286a.mo22675a(Collections.emptyList(), 10000);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.creativex.recorder.p938a.AbstractC14095a.RunnableC140972 */

                        static {
                            Covode.recordClassIndex(16166);
                        }

                        public final void run() {
                            if (z) {
                                AbstractC14095a aVar = AbstractC14095a.this;
                                aVar.mo22647b(aVar.f34289d);
                            }
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                /* class com.bytedance.creativex.recorder.p938a.AbstractC14095a.RunnableC140972.RunnableC140981 */

                                static {
                                    Covode.recordClassIndex(16167);
                                }

                                public final void run() {
                                    if (AbstractC14095a.this.f34287b.mo121773f()) {
                                        AbstractC14095a.this.f34286a.mo22681c(arrayList4, 10000);
                                    } else {
                                        AbstractC14095a.this.f34286a.mo22681c(Collections.emptyList(), 10000);
                                    }
                                }
                            }, 50);
                        }
                    }, 250);
                } else if (this.f34287b.mo121773f()) {
                    if (!this.f34293h || z) {
                        this.f34286a.mo22675a(C14109f.m25704a(this.f34288c), 10000);
                    } else {
                        this.f34286a.mo22679b(C14109f.m25704a(this.f34288c), 10000);
                    }
                } else if (!this.f34293h || z) {
                    this.f34286a.mo22675a(Collections.emptyList(), 10000);
                } else {
                    this.f34286a.mo22679b(Collections.emptyList(), 10000);
                }
            }
        } catch (Exception e) {
            if (!C84401c.f188718b) {
                mo22644a(new C14107d(e));
                return;
            }
            throw new RuntimeException("thx to contact dengchong.999 ...", e);
        }
    }

    public AbstractC14095a(AbstractC78054d dVar, AbstractC78051c cVar, AbstractC14210a aVar, AbstractC84903j jVar, boolean z) {
        this.f34286a = dVar;
        this.f34287b = cVar;
        this.f34291f = jVar;
        this.f34292g = aVar;
        this.f34293h = z;
        dVar.mo22690o();
    }
}
