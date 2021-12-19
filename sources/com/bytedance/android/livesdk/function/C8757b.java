package com.bytedance.android.livesdk.function;

import android.widget.ImageView;
import com.bytedance.android.live.core.p218f.p219a.C3899h;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.C6912bl;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.function.b */
final /* synthetic */ class C8757b implements AbstractC89172b {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f21612a;

    static {
        Covode.recordClassIndex(9634);
    }

    C8757b(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f21612a = liveRoomNotifyWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f21612a;
        C9691bw bwVar = (C9691bw) obj;
        if (!liveRoomNotifyWidget.isViewValid() || bwVar == null) {
            EnumC7303c.INSTANCE.onMessageFinish();
        } else {
            if (C6912bl.f17297a) {
                liveRoomNotifyWidget.mo15026a();
            }
            liveRoomNotifyWidget.f21586g = bwVar;
            liveRoomNotifyWidget.show();
            if (liveRoomNotifyWidget.getView() != null) {
                liveRoomNotifyWidget.getView().setTranslationX((float) (C6229a.m13521a(liveRoomNotifyWidget.context) ? -liveRoomNotifyWidget.f21582c : liveRoomNotifyWidget.f21582c));
            }
            if (bwVar.f23604i == null || bwVar.f23604i.f23284b == null || C13617h.m24465a(bwVar.f23604i.f23284b.getUrls())) {
                liveRoomNotifyWidget.mo15027a(bwVar);
            } else {
                liveRoomNotifyWidget.f21580a.setBackgroundResource(0);
                C3899h.m9529a(liveRoomNotifyWidget.f21580a, "2131362407", bwVar);
                ImageView imageView = liveRoomNotifyWidget.f21580a;
                RoomNotifyMessageExtra.Background background = bwVar.f23604i.f23284b;
                LiveRoomNotifyWidget.C87493 r3 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c6: CONSTRUCTOR  (r3v1 'r3' com.bytedance.android.livesdk.function.LiveRoomNotifyWidget$3) = 
                      (r4v0 'liveRoomNotifyWidget' com.bytedance.android.livesdk.function.LiveRoomNotifyWidget)
                      (r11v1 'bwVar' com.bytedance.android.livesdk.model.message.bw)
                     call: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.3.<init>(com.bytedance.android.livesdk.function.LiveRoomNotifyWidget, com.bytedance.android.livesdk.model.message.bw):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.function.b.invoke(java.lang.Object):java.lang.Object, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 274
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.C8757b.invoke(java.lang.Object):java.lang.Object");
            }
        }
