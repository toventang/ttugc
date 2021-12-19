package com.lynx.tasm.p2062ui.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a;
import com.lynx.tasm.behavior.shadow.C28544i;
import com.lynx.tasm.behavior.shadow.C28545j;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;

/* renamed from: com.lynx.tasm.ui.image.FrescoInlineImageShadowNode */
public class FrescoInlineImageShadowNode extends AbsInlineImageShadowNode {

    /* renamed from: a */
    public String f68165a;

    /* renamed from: b */
    private Uri f68166b;

    /* renamed from: c */
    private C24229q.AbstractC24231b f68167c = C24229q.AbstractC24231b.f57452b;

    /* renamed from: o */
    private final AbstractC24198b f68168o = C24182c.m45843b();

    /* renamed from: p */
    private boolean f68169p;

    /* renamed from: q */
    private boolean f68170q;

    /* renamed from: r */
    private final C24202c f68171r = new C24202c() {
        /* class com.lynx.tasm.p2062ui.image.FrescoInlineImageShadowNode.C288671 */

        static {
            Covode.recordClassIndex(34983);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            String message;
            super.onFailure(str, th);
            if (th == null) {
                message = "unknown";
            } else {
                message = th.getMessage();
            }
            FrescoInlineImageShadowNode.this.mo49117a(message);
            FrescoInlineImageShadowNode.this.mo49108h().mo49039a(FrescoInlineImageShadowNode.this.f68165a, "image", message);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, obj, animatable);
            if (obj instanceof C24455d) {
                C24117a<Bitmap> f = ((C24455d) obj).mo40299f();
                if (f == null) {
                    FrescoInlineImageShadowNode.this.mo49117a("reference null");
                    FrescoInlineImageShadowNode.this.mo49108h().mo49039a(FrescoInlineImageShadowNode.this.f68165a, "image", "reference null");
                    return;
                }
                Bitmap a = f.mo39695a();
                if (a == null) {
                    FrescoInlineImageShadowNode.this.mo49117a("bitmap null");
                    FrescoInlineImageShadowNode.this.mo49108h().mo49039a(FrescoInlineImageShadowNode.this.f68165a, "image", "bitmap null");
                    return;
                }
                FrescoInlineImageShadowNode.this.mo49115a(a.getWidth(), a.getHeight());
            } else if (animatable instanceof C24290a) {
                C24290a aVar = (C24290a) animatable;
                FrescoInlineImageShadowNode.this.mo49115a(aVar.getIntrinsicWidth(), aVar.getIntrinsicHeight());
                C28884b.m57862a(aVar);
            }
        }
    };

    static {
        Covode.recordClassIndex(34981);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    /* renamed from: b */
    public final AbstractC28676a mo49118b() {
        MethodCollector.m26663i(8074);
        Resources resources = mo49108h().getResources();
        C28545j jVar = this.f67133g;
        float nativeGetWidth = jVar.f67153a.nativeGetWidth(jVar.f67153a.f67130d);
        C28545j jVar2 = this.f67133g;
        float nativeGetHeight = jVar2.f67153a.nativeGetHeight(jVar2.f67153a.f67130d);
        C28545j jVar3 = this.f67133g;
        C28889c cVar = new C28889c(resources, (int) Math.ceil((double) nativeGetWidth), (int) Math.ceil((double) nativeGetHeight), jVar3.f67153a.nativeGetMargin(jVar3.f67153a.f67130d), this.f68166b, this.f68167c, this.f68168o, this.f68171r);
        C28544i iVar = this.f67139l;
        if (iVar != null) {
            int i = iVar.f67151a;
            float f = iVar.f67152b;
            cVar.f67595c = i;
            cVar.f67596d = f;
        }
        MethodCollector.m26664o(8074);
        return cVar;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: g */
    public final void mo49107g() {
        if (this.f68169p) {
            Uri uri = null;
            if (this.f68165a != null) {
                if (!this.f68170q) {
                    this.f68165a = C28621a.m57207a(mo49108h(), this.f68165a);
                }
                Uri parse = Uri.parse(this.f68165a);
                if (parse.getScheme() == null) {
                    LLog.m56862d("Lynx", "Image src should not be relative url : " + this.f68165a);
                } else {
                    uri = parse;
                }
            }
            this.f68166b = uri;
            this.f68169p = false;
        }
    }

    @AbstractC28525m(mo49059a = "skip-redirection", mo49064f = false)
    public void setSkipRedirection(boolean z) {
        this.f68170q = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setMode(String str) {
        this.f68167c = C28894g.m57881a(str);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setSource(String str) {
        this.f68165a = str;
        this.f68169p = true;
        mo49092d();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: b */
    public final void mo49104b(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                int hashCode = nextKey.hashCode();
                if (hashCode != -1338903714) {
                    if (hashCode != 114148) {
                        if (hashCode == 3357091) {
                            if (nextKey.equals("mode")) {
                                setMode(readableMap.getString(nextKey));
                            }
                        }
                    } else if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                    }
                } else if (nextKey.equals("skip-redirection")) {
                    setSkipRedirection(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo49104b(vVar);
    }
}
