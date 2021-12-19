package com.p2082ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effectplatform.C46407d;
import com.p2082ss.android.ugc.aweme.effectplatform.C46432r;
import com.p2082ss.android.ugc.aweme.effectplatform.C46436u;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.ugc.effectplatform.C86717b;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86793b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4453j.C86812c;
import com.p2082ss.ugc.effectplatform.task.C86875af;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectPlatform */
public class EffectPlatform implements AbstractC33974au, AbstractC46415f {

    /* renamed from: a */
    public static final File f108127a = new File(C63247i.f143610a.getFilesDir(), "effect");

    /* renamed from: b */
    public static final File f108128b = new File(C63247i.f143610a.getFilesDir(), "effectmodel");

    /* renamed from: c */
    public static final File f108129c = new File(C63247i.f143610a.getFilesDir(), "pin");

    /* renamed from: d */
    public static ArrayList<String> f108130d;

    /* renamed from: h */
    private static ArrayList<String> f108131h;

    /* renamed from: f */
    private C46407d f108132f;

    /* renamed from: g */
    private EffectConfiguration f108133g;

    /* renamed from: a */
    public static String m89510a() {
        return "1180";
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78889a(AbstractC86796e<RecommendSearchWordsResponse> eVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78890a(InfoStickerEffect infoStickerEffect, AbstractC86793b bVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78895a(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78899a(String str, String str2, String str3, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78908a(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchPanelInfoListener.onFail(C46407d.m89555a());
            return;
        }
        C46436u a = C46436u.C46437a.m89603a(str, iFetchPanelInfoListener);
        a.f108205a = dVar.f108143c;
        dVar.mo78933a(str, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (wrap: com.ss.android.ugc.aweme.effectplatform.d$1 : 0x001d: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.effectplatform.d$1) = 
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (r10v0 'z' boolean)
              (r11v0 'str2' java.lang.String)
              (r12v0 'i' int)
              (r13v0 'i2' int)
              (r7v0 'a' com.ss.android.ugc.aweme.effectplatform.u)
             call: com.ss.android.ugc.aweme.effectplatform.d.1.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.effectplatform.d.a(java.lang.String, com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener):void in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.effectplatform.d$1) = 
              (r1v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r9v0 'str' java.lang.String)
              (r10v0 'z' boolean)
              (r11v0 'str2' java.lang.String)
              (r12v0 'i' int)
              (r13v0 'i2' int)
              (r7v0 'a' com.ss.android.ugc.aweme.effectplatform.u)
             call: com.ss.android.ugc.aweme.effectplatform.d.1.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.effectplatform.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.effectplatform.d r1 = r8.f108132f
            boolean r0 = r1.f108141a
            if (r0 != 0) goto L_0x000e
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.p2082ss.android.ugc.aweme.effectplatform.C46407d.m89555a()
            r14.onFail(r0)
            return
        L_0x000e:
            r2 = r9
            com.ss.android.ugc.aweme.effectplatform.u r7 = com.p2082ss.android.ugc.aweme.effectplatform.C46436u.C46437a.m89603a(r2, r14)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f108143c
            r7.f108205a = r0
            com.ss.android.ugc.aweme.effectplatform.d$1 r0 = new com.ss.android.ugc.aweme.effectplatform.d$1
            r5 = r12
            r6 = r13
            r3 = r10
            r4 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r1.mo78933a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform.mo78908a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78907a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchEffectChannelListener.onFail(C46407d.m89555a());
            return;
        }
        C46407d.C464092 r3 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r3v0 'r3' com.ss.android.ugc.aweme.effectplatform.d$2) = 
              (r4v0 'dVar' com.ss.android.ugc.aweme.effectplatform.d)
              (r6v0 'str' java.lang.String)
              (r7v0 'z' boolean)
              (r8v0 'iFetchEffectChannelListener' com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener)
             call: com.ss.android.ugc.aweme.effectplatform.d.2.<init>(com.ss.android.ugc.aweme.effectplatform.d, java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.effectplatform.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            */
        /*
            this = this;
            r5.m89514g()
            com.ss.android.ugc.aweme.effectplatform.d r4 = r5.f108132f
            boolean r0 = r4.f108141a
            if (r0 != 0) goto L_0x0011
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.p2082ss.android.ugc.aweme.effectplatform.C46407d.m89555a()
            r8.onFail(r0)
            return
        L_0x0011:
            com.ss.android.ugc.aweme.effectplatform.d$2 r3 = new com.ss.android.ugc.aweme.effectplatform.d$2
            r3.<init>(r6, r7, r8)
            boolean r0 = r4.f108141a
            if (r0 != 0) goto L_0x0022
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r0 = com.p2082ss.android.ugc.aweme.effectplatform.C46407d.m89555a()
            r3.checkChannelFailed(r0)
            return
        L_0x0022:
            com.ss.android.ugc.effectmanager.EffectManager r2 = r4.f108142b
            r1 = 0
            com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener r0 = r4.mo78932a(r3)
            r2.checkedEffectListUpdate(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform.mo78907a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78902a(String str, String str2, boolean z, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchCategoryEffectListener.onFail(C46407d.m89555a());
            return;
        }
        C46432r a = C46432r.C46433a.m89595a(str, i, i2, iFetchCategoryEffectListener);
        a.f108191a = dVar.f108143c;
        dVar.mo78935a(str, str2, i, i2, i3, str3, z, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78903a(String str, String str2, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchProviderEffect.onFail(C46407d.m89555a());
        } else {
            dVar.f108142b.fetchProviderEffect(str, z, i, i2, str2, iFetchProviderEffect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78901a(String str, String str2, Map<String, String> map, boolean z, AbstractC86794c cVar) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            C86840e eVar = new C86840e(new RuntimeException());
            eVar.f195756a = -1;
            eVar.f195757b = "effect sdk manager init failed";
            cVar.mo116409a(eVar);
            return;
        }
        dVar.f108142b.fetchProviderEffectsByGiphyIds(str, str2, map, z, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78906a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchEffectListener.onFail(null, C46407d.m89555a());
        } else {
            dVar.f108142b.fetchEffectWithDownload(str, map, iFetchEffectListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78912a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchEffectListListener.onFail(C46407d.m89555a());
        } else {
            dVar.f108142b.fetchEffectList(list, z, map, iFetchEffectListListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78911a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchEffectListByIdsListener.onFail(C46407d.m89555a());
        } else {
            dVar.f108142b.fetchEffectList2(list, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78897a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        C46407d dVar = this.f108132f;
        if (str != null && str2 != null) {
            if (!dVar.f108141a) {
                iUpdateTagListener.onFinally();
            } else {
                dVar.f108142b.updateTag(str, str2, iUpdateTagListener);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78904a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C46407d dVar = this.f108132f;
        if (str != null && !C84904k.m145909a(list)) {
            if (!dVar.f108141a) {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            } else {
                dVar.f108142b.isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78905a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        C46407d dVar = this.f108132f;
        Boolean valueOf = Boolean.valueOf(z);
        if (!dVar.f108141a) {
            iModFavoriteList.onFail(C46407d.m89555a());
        } else {
            dVar.f108142b.modifyFavoriteList(str, list, valueOf, iModFavoriteList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final boolean mo78914a(Effect effect) {
        C46407d dVar = this.f108132f;
        if (effect == null || dVar.f108142b == null) {
            return false;
        }
        return DownloadableModelSupport.getInstance().isEffectReady(dVar.f108142b, effect);
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78910a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (z) {
            mo78892a(str, iFetchEffectChannelListener);
            return;
        }
        m89514g();
        this.f108132f.mo78936a(str, z2, iFetchEffectChannelListener);
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78909a(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        if (z2) {
            this.f108132f.mo78937a(str, z, str2, i, i2, iFetchPanelInfoListener);
        } else {
            this.f108132f.mo78938b(str, z, str2, i, i2, iFetchPanelInfoListener);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78894a(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.f108132f.mo78935a(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78913a(Map<String, Object> map) {
        this.f108132f.f108143c = map;
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78900a(String str, String str2, String str3, String str4, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        m89514g();
        C46407d dVar = this.f108132f;
        AbstractC86796e<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2);
        if (dVar.f108141a) {
            C86717b effectPlatform = dVar.f108142b.getEffectPlatform();
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str4, "");
            effectPlatform.mo139960a().mo140049a(str2, str4, i, i2, map, kNListener, str);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78898a(String str, String str2, String str3, int i, int i2, IFetchProviderEffect iFetchProviderEffect, boolean z) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (C63244g.m114602a().mo73255A() != null && C63244g.m114602a().mo73255A().mo93901a()) {
            iFetchProviderEffect.onFail(C46407d.m89555a());
        } else if (!dVar.f108141a) {
            iFetchProviderEffect.onFail(C46407d.m89555a());
        } else {
            dVar.f108142b.searchProviderEffect(str, str2, i, i2, false, str3, iFetchProviderEffect);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78896a(String str, String str2, int i, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
        if (i == AbstractC84398d.C84399a.f188715c) {
            this.f108132f.mo78933a(str, iCheckChannelListener);
        } else if (i == AbstractC84398d.C84399a.f188714b) {
            C46407d dVar = this.f108132f;
            if (!dVar.f108141a) {
                iCheckChannelListener.checkChannelFailed(C46407d.m89555a());
            } else {
                dVar.f108142b.checkCategoryIsUpdate(str, str2, null, dVar.mo78932a(iCheckChannelListener));
            }
        } else {
            m89514g();
            C46407d dVar2 = this.f108132f;
            if (!dVar2.f108141a) {
                iCheckChannelListener.checkChannelFailed(C46407d.m89555a());
            } else if (map != null) {
                throw new NullPointerException("putAll");
            } else {
                dVar2.f108142b.checkedEffectListUpdate(str, null, dVar2.mo78932a(iCheckChannelListener));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: c */
    public final EffectManager mo78917c() {
        return this.f108132f.f108142b;
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: d */
    public final void mo78919d() {
        C46407d dVar = this.f108132f;
        if (dVar.f108141a) {
            dVar.f108142b.removeListener();
        }
    }

    /* renamed from: b */
    public static String m89511b() {
        String j = C63244g.m114602a().mo73295w().mo93781j();
        C63244g.m114602a().mo73295w();
        return j;
    }

    /* renamed from: e */
    public static ArrayList<String> m89512e() {
        ArrayList<String> arrayList = f108131h;
        if (arrayList != null) {
            return arrayList;
        }
        m89513f();
        ArrayList<String> arrayList2 = f108131h;
        if (arrayList2 != null) {
            return arrayList2;
        }
        return new ArrayList<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void destroy() {
        C46407d dVar = this.f108132f;
        if (dVar.f108142b != null) {
            dVar.f108142b.destroy();
            dVar.f108142b = null;
        }
        dVar.f108141a = false;
    }

    static {
        Covode.recordClassIndex(54979);
    }

    /* renamed from: g */
    private void m89514g() {
        EffectConfiguration effectConfiguration = this.f108133g;
        if (effectConfiguration != null) {
            String str = "0";
            if (TextUtils.isEmpty(effectConfiguration.getDeviceId()) || TextUtils.equals(str, this.f108133g.getDeviceId())) {
                EffectConfiguration effectConfiguration2 = this.f108133g;
                if (AppLog.getServerDeviceId() != null) {
                    str = AppLog.getServerDeviceId();
                }
                effectConfiguration2.setDeviceId(str);
            }
        }
    }

    /* renamed from: f */
    public static ArrayList<String> m89513f() {
        List<C43223c> list;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            list = C63244g.m114602a().mo73275c().mo101850c();
        } catch (Exception unused) {
            list = null;
        }
        if (list == null) {
            return new ArrayList<>();
        }
        for (C43223c cVar : list) {
            String str3 = "";
            if (!(cVar.mo73694j() == null || cVar.mo73694j().stickers == null)) {
                for (StickerItemModel stickerItemModel : cVar.mo73694j().stickers) {
                    if (TextUtils.isEmpty(stickerItemModel.path)) {
                        AbstractC63190ap I = C63244g.m114602a().mo73263I();
                        StringBuilder sb = new StringBuilder("InfoStickers_resdir_null:");
                        if (stickerItemModel.stickerId != null) {
                            str2 = stickerItemModel.stickerId;
                        } else {
                            str2 = str3;
                        }
                        I.mo101640b(sb.append(str2).toString());
                    } else {
                        arrayList.add(stickerItemModel.path.substring(stickerItemModel.path.lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (!(cVar.f100882E == null || cVar.f100882E.getEffectPointModels() == null)) {
                Iterator<EffectPointModel> it = cVar.f100882E.getEffectPointModels().iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (TextUtils.isEmpty(next.getResDir())) {
                        AbstractC63190ap I2 = C63244g.m114602a().mo73263I();
                        StringBuilder sb2 = new StringBuilder("EffectListModel_resdir_null:");
                        if (next.getKey() != null) {
                            str = next.getKey();
                        } else {
                            str = str3;
                        }
                        I2.mo101640b(sb2.append(str).toString());
                    } else {
                        arrayList.add(next.getResDir().substring(next.getResDir().lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (cVar.mo73722q() != null) {
                String str4 = cVar.mo73722q().f100951d;
                if (TextUtils.isEmpty(str4)) {
                    AbstractC63190ap I3 = C63244g.m114602a().mo73263I();
                    StringBuilder sb3 = new StringBuilder("EffectListModel_resdir_null:");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    I3.mo101640b(sb3.append(str3).toString());
                } else {
                    arrayList.add(str4.substring(str4.lastIndexOf(File.separator) + 1));
                }
            }
            if (cVar.f100908h != null) {
                arrayList2.add(cVar.f100908h);
            }
        }
        f108131h = new ArrayList<>(new HashSet(arrayList));
        f108130d = new ArrayList<>(new HashSet(arrayList2));
        return f108131h;
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78886a(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: b */
    public final boolean mo78916b(Effect effect) {
        return this.f108132f.f108142b.isEffectDownloading(effect);
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: c */
    public final boolean mo78918c(Effect effect) {
        return mo78914a(effect);
    }

    public EffectPlatform(EffectConfiguration effectConfiguration) {
        this.f108133g = effectConfiguration;
        C46407d dVar = new C46407d();
        this.f108132f = dVar;
        dVar.f108142b = new EffectManager();
        dVar.f108141a = dVar.f108142b.init(effectConfiguration);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78891a(String str) {
        C46407d dVar = this.f108132f;
        if (dVar != null && dVar.f108141a) {
            dVar.f108142b.clearCache(str);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: b */
    public final void mo78915b(Effect effect, IFetchEffectListener iFetchEffectListener) {
        mo78887a(effect, iFetchEffectListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78888a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iDownloadProviderEffectListener.onFail(providerEffect, C46407d.m89555a());
        } else {
            dVar.f108142b.downloadProviderEffect(providerEffect, iDownloadProviderEffectListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78887a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        m89514g();
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchEffectListener.onFail(effect, C46407d.m89555a());
        } else if (effect == null) {
            ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
            exceptionResult.setErrorCode(-1);
            exceptionResult.setMsg("effect is null.");
            iFetchEffectListener.onFail(null, exceptionResult);
        } else {
            dVar.f108142b.fetchEffect(effect, iFetchEffectListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
    /* renamed from: a */
    public final void mo78892a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        m89514g();
        this.f108132f.mo78934a(str, iFetchEffectChannelListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78893a(String str, IFetchFavoriteList iFetchFavoriteList) {
        C46407d dVar = this.f108132f;
        if (!dVar.f108141a) {
            iFetchFavoriteList.onFailed(C46407d.m89555a());
        } else {
            dVar.f108142b.fetchFavoriteList(str, iFetchFavoriteList);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    public final void mo78885a(int i, String str, String str2, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
        if (this.f108132f.f108142b == null) {
            eVar.onFail(null, new C86840e(-1));
            return;
        }
        C86717b effectPlatform = this.f108132f.f108142b.getEffectPlatform();
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C86812c b = effectPlatform.mo139967b();
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            b.f195723a.f195443K.mo140036a(a, eVar);
        }
        C86875af afVar = new C86875af(b.f195723a, i, str, str2, num, num2, a);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(afVar);
        }
    }
}
