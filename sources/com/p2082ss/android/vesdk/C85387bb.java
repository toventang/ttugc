package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.clipparam.VEClipParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.p4390f.AbstractC85468e;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.bb */
public final class C85387bb implements AbstractC85468e {

    /* renamed from: a */
    private final C85581w f191132a;

    /* renamed from: b */
    private final TEInterface f191133b;

    static {
        Covode.recordClassIndex(99499);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130864a(C85391be beVar) {
        MethodCollector.m26663i(12529);
        C85315al.m146641c("VEEditor_VESequenceInvoker", "updateSceneTime... " + beVar.toString());
        synchronized (this.f191132a) {
            try {
                this.f191133b.stop();
                int updateSenceTime = this.f191133b.updateSenceTime(beVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", String.valueOf(updateSenceTime >= 0 ? 0 : updateSenceTime));
                    jSONObject.put("sceneTime", beVar.toString());
                    C30683b.m63032a("vesdk_event_editor_update_scene_time", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (updateSenceTime < 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                    return updateSenceTime;
                }
                this.f191132a.f191764A = 0;
                this.f191132a.f191836c.mo131144b();
                this.f191133b.setTimeRange(0, updateSenceTime, 0);
                int prepareEngine = this.f191133b.prepareEngine(0);
                if (prepareEngine != 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.m26664o(12529);
                    return prepareEngine;
                }
                MethodCollector.m26664o(12529);
                return 0;
            } finally {
                MethodCollector.m26664o(12529);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130865a(C85391be beVar, int i, int i2) {
        MethodCollector.m26663i(12840);
        C85315al.m146641c("VEEditor_VESequenceInvoker", "updateSceneTime with start/end time" + beVar.toString() + " startTime: " + i + " endTime: " + i2);
        synchronized (this.f191132a) {
            try {
                this.f191133b.stop();
                int updateSenceTime = this.f191133b.updateSenceTime(beVar);
                if (updateSenceTime < 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                    return updateSenceTime;
                }
                this.f191132a.f191764A = 0;
                this.f191133b.setTimeRange(i, i2, 0);
                int prepareEngine = this.f191133b.prepareEngine(0);
                if (prepareEngine != 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.m26664o(12840);
                    return prepareEngine;
                }
                MethodCollector.m26664o(12840);
                return 0;
            } finally {
                MethodCollector.m26664o(12840);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final String mo130868a(int i, int i2, int i3, String str) {
        String clipInfoStringWithPath;
        MethodCollector.m26663i(14321);
        synchronized (this.f191132a) {
            try {
                C85315al.m146637a("VEEditor_VESequenceInvoker", "getClipFileInfoStringWithPath... " + i + ", " + i2 + ", " + i3);
                clipInfoStringWithPath = this.f191133b.getClipInfoStringWithPath(i, i2, i3, str);
                C85315al.m146637a("VEEditor_VESequenceInvoker", "getClipInfoStringWithPath result ".concat(String.valueOf(clipInfoStringWithPath)));
            } finally {
                MethodCollector.m26664o(14321);
            }
        }
        return clipInfoStringWithPath;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130867a(String str, int i, int i2, boolean z) {
        MethodCollector.m26663i(14328);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "addAudioTrack... " + str + " In " + i + " Out " + i2 + " " + z);
                if (TextUtils.isEmpty(str)) {
                    return -100;
                }
                if (i2 <= i || i < 0) {
                    MethodCollector.m26664o(14328);
                    return -100;
                }
                C30689e.m63052a("iesve_veeditor_import_music", 1, (C85509a) null);
                int addAudioTrack = this.f191133b.addAudioTrack(str, 0, i2 - i, i, i2, z);
                C85315al.m146642d("VEEditor_VESequenceInvoker", "trackIndexNative=".concat(String.valueOf(addAudioTrack)));
                int a = this.f191132a.f191852s.mo54954a(addAudioTrack);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("path", str);
                    jSONObject.put("trimIn", i);
                    jSONObject.put("trimOut", i2);
                    jSONObject.put("resultCode", a >= 0 ? 0 : -1);
                    C30683b.m63032a("vesdk_event_editor_audio_track", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C85315al.m146641c("VEEditor_VESequenceInvoker", "addAudioTrack... ".concat(String.valueOf(a)));
                MethodCollector.m26664o(14328);
                return a;
            } finally {
                MethodCollector.m26664o(14328);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130866a(String str, int i, int i2, int i3, int i4, boolean z) {
        Throwable th;
        MethodCollector.m26663i(14334);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "addAudioTrack... " + str + " In " + i + " Out " + i2 + " SeqIn " + i3 + " seqOut " + i4 + " " + z);
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.m26664o(14334);
                    return -100;
                } else if (i2 <= i || i < 0) {
                    MethodCollector.m26664o(14334);
                    return -100;
                } else if (i4 <= i3 || i3 < 0) {
                    MethodCollector.m26664o(14334);
                    return -100;
                } else {
                    try {
                        int a = this.f191132a.f191852s.mo54954a(this.f191133b.addAudioTrack(str, (String) null, i3, i4, i, i2, z, false));
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("path", str);
                            jSONObject.put("sequenceIn", i3);
                            jSONObject.put("sequenceOut", i4);
                            jSONObject.put("trimIn", i);
                            jSONObject.put("trimOut", i2);
                            jSONObject.put("resultCode", a >= 0 ? 0 : a);
                            C30683b.m63032a("vesdk_event_editor_audio_track", jSONObject, "behavior");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C85315al.m146641c("VEEditor_VESequenceInvoker", "addAudioTrack... ".concat(String.valueOf(a)));
                        MethodCollector.m26664o(14334);
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        MethodCollector.m26664o(14334);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(14334);
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final boolean mo130869a(int i, int i2, float f) {
        boolean trackVolume;
        MethodCollector.m26663i(12719);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "setVolume... index:" + i + " type:" + i2 + " volume:" + f);
                trackVolume = this.f191133b.setTrackVolume(i2, this.f191132a.f191852s.mo54955a(1, i), f);
            } finally {
                MethodCollector.m26664o(12719);
            }
        }
        return trackVolume;
    }

    public C85387bb(C85581w wVar) {
        this.f191132a = wVar;
        this.f191133b = wVar.f191765B;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130855a(int i) {
        C85315al.m146641c("VEEditor_VESequenceInvoker", "expandTimeline: ".concat(String.valueOf(i)));
        return this.f191133b.expandTimeline(i);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: c */
    public final float mo130874c(int i) {
        C85315al.m146641c("VEEditor_VESequenceInvoker", "getVolume...");
        if (this.f191133b.getDuration() < 0) {
            return -100.0f;
        }
        return this.f191133b.getTrackVolume(1, this.f191132a.f191852s.mo54955a(1, i), 0);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: b */
    public final int mo130870b(int i) {
        MethodCollector.m26663i(12366);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "deleteAudioTrack... trackIndex:" + i + " needPrepare:false");
                if (i >= 0) {
                    int a = this.f191132a.f191852s.mo54955a(1, i);
                    this.f191132a.f191852s.f73288c.remove(Integer.valueOf(i));
                    return this.f191133b.deleteAudioTrack(a, false);
                }
                MethodCollector.m26664o(12366);
                return -100;
            } finally {
                MethodCollector.m26664o(12366);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: b */
    public final List<VEClipParam> mo130873b(int i, int i2) {
        List<VEClipParam> allClips = this.f191133b.getAllClips(i, i2);
        for (int i3 = 0; i3 < allClips.size(); i3++) {
            C85315al.m146641c("VEEditor_VESequenceInvoker", "getAllClips: " + allClips.get(i3).toString());
        }
        return allClips;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130856a(int i, int i2) {
        int prepareEngine;
        MethodCollector.m26663i(12405);
        synchronized (this.f191132a) {
            try {
                C85509a aVar = new C85509a();
                aVar.mo131334a("iesve_veeditor_cut_duration", i2 - i);
                C30689e.m63052a("iesve_veeditor_cut_duration", 1, aVar);
                C85315al.m146637a("VEEditor_VESequenceInvoker", "setInOut... " + i + " " + i2);
                this.f191133b.stop();
                this.f191133b.setTimeRange(i, i2, 0);
                prepareEngine = this.f191133b.prepareEngine(0);
            } finally {
                MethodCollector.m26664o(12405);
            }
        }
        return prepareEngine;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130857a(int i, int i2, int i3) {
        return this.f191133b.setTrackDurationType(0, 0, 0);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: b */
    public final int mo130872b(int i, int i2, C85581w.EnumC85608g gVar) {
        int timeRange;
        MethodCollector.m26663i(12527);
        synchronized (this.f191132a) {
            try {
                timeRange = this.f191133b.setTimeRange(i, i2, gVar.getValue());
            } finally {
                MethodCollector.m26664o(12527);
            }
        }
        return timeRange;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130860a(int i, int i2, ROTATE_DEGREE rotate_degree) {
        C85315al.m146637a("VEEditor_VESequenceInvoker", "setFileRotate...0" + " " + i2 + " " + rotate_degree);
        return this.f191133b.setClipAttr(0, 0, i2, "clip rotate", new StringBuilder().append(rotate_degree.ordinal()).toString());
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: b */
    public final int mo130871b(int i, int i2, int i3) {
        MethodCollector.m26663i(14309);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "moveClip, trackType:0" + " from:" + i2 + " to:" + i3 + " isMoveEffect:true");
                this.f191133b.stop();
                int moveClip = this.f191133b.moveClip(0, i2, i3, true);
                if (moveClip < 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "moveClip failed, ret = ".concat(String.valueOf(moveClip)));
                    return moveClip;
                }
                this.f191132a.f191764A = 0;
                int g = this.f191132a.mo131689g();
                if (g != 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g)));
                    MethodCollector.m26664o(14309);
                    return g;
                }
                MethodCollector.m26664o(14309);
                return 0;
            } finally {
                MethodCollector.m26664o(14309);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130861a(int i, int i2, C85581w.EnumC85608g gVar) {
        int prepareEngine;
        MethodCollector.m26663i(12526);
        synchronized (this.f191132a) {
            try {
                C85509a aVar = new C85509a();
                aVar.mo131334a("iesve_veeditor_cut_duration", i2 - i);
                C30689e.m63052a("iesve_veeditor_cut_duration", 1, aVar);
                C85315al.m146637a("VEEditor_VESequenceInvoker", "setInOut... " + i + " " + i2 + " mode " + gVar.getValue());
                this.f191133b.stop();
                this.f191133b.setTimeRange(i, i2, gVar.getValue());
                prepareEngine = this.f191133b.prepareEngine(0);
            } finally {
                MethodCollector.m26664o(12526);
            }
        }
        return prepareEngine;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130859a(int i, int i2, int i3, boolean z) {
        MethodCollector.m26663i(14338);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "updateAudioTrack...  Index " + i + " In " + i2 + " Out " + i3 + " " + z);
                if (i < 0) {
                    return -100;
                }
                if (i3 <= i2 || i2 < 0) {
                    MethodCollector.m26664o(14338);
                    return -100;
                }
                int updateAudioTrack = this.f191133b.updateAudioTrack(this.f191132a.f191852s.mo54955a(1, i), 0, i3 - i2, i2, i3, z, false);
                MethodCollector.m26664o(14338);
                return updateAudioTrack;
            } finally {
                MethodCollector.m26664o(14338);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130862a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        int i3 = i2;
        MethodCollector.m26663i(14301);
        synchronized (this.f191132a) {
            try {
                C85315al.m146641c("VEEditor_VESequenceInvoker", "insertClip, trackType:0" + "clipIndex:" + i3);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    C85315al.m146641c("VEEditor_VESequenceInvoker", "index: " + i4 + "clipSourceParams: " + arrayList.get(i4).toString());
                }
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    C85315al.m146641c("VEEditor_VESequenceInvoker", "index: " + i5 + "clipTimelineParams: " + arrayList2.get(i5).toString());
                }
                this.f191133b.stop();
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    int insertClip = this.f191133b.insertClip(0, 0, i3, arrayList.get(i6), arrayList2.get(i6));
                    if (insertClip < 0) {
                        C85315al.m146642d("VEEditor_VESequenceInvoker", "insertClip failed, ret = ".concat(String.valueOf(insertClip)));
                        return insertClip;
                    }
                    i3++;
                }
                this.f191132a.f191764A = 0;
                TEInterface tEInterface = this.f191133b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                int g = this.f191132a.mo131689g();
                if (g != 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g)));
                    MethodCollector.m26664o(14301);
                    return g;
                }
                MethodCollector.m26664o(14301);
                return 0;
            } finally {
                MethodCollector.m26664o(14301);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130863a(int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        MethodCollector.m26663i(14319);
        synchronized (this.f191132a) {
            try {
                C85581w wVar = this.f191132a;
                if (wVar.f191790a.isMVInitialedInternal()) {
                    wVar.f191790a.changeMvUserVideoInfoInternal(0, iArr, vEClipTimelineParamArr, null);
                }
                C85315al.m146637a("VEEditor_VESequenceInvoker", "updateClipsTimelineParam, trackType:" + i + " trackIndex:0");
                if (iArr.length != vEClipTimelineParamArr.length || iArr.length <= 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam failed, clipIndexes not match clipTimelineParams");
                    return -100;
                }
                for (int i3 = 0; i3 < vEClipTimelineParamArr.length; i3++) {
                    if (vEClipTimelineParamArr[i3].trimOut >= 0 && vEClipTimelineParamArr[i3].trimOut <= vEClipTimelineParamArr[i3].trimIn) {
                        C85315al.m146642d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam invalid param trimIn[" + i3 + "]=" + vEClipTimelineParamArr[i3].trimIn + ", trimOut[" + i3 + "]=" + vEClipTimelineParamArr[i3].trimOut);
                        MethodCollector.m26664o(14319);
                        return -100;
                    }
                }
                this.f191133b.stop();
                if (i == 1) {
                    i2 = this.f191132a.f191852s.mo54955a(1, 0);
                } else if (i == 0) {
                    i2 = this.f191132a.f191852s.mo54955a(2, 0);
                }
                int updateClipsTimelineParam = this.f191133b.updateClipsTimelineParam(i, i2, iArr, vEClipTimelineParamArr);
                if (updateClipsTimelineParam < 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                    MethodCollector.m26664o(14319);
                    return updateClipsTimelineParam;
                }
                this.f191132a.f191764A = 0;
                TEInterface tEInterface = this.f191133b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                int g = this.f191132a.mo131689g();
                if (g != 0) {
                    C85315al.m146642d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g)));
                    MethodCollector.m26664o(14319);
                    return g;
                }
                MethodCollector.m26664o(14319);
                return 0;
            } finally {
                MethodCollector.m26664o(14319);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85468e
    /* renamed from: a */
    public final int mo130858a(int i, int i2, int i3, int i4, int i5, boolean z) {
        MethodCollector.m26663i(11966);
        synchronized (this.f191132a) {
            try {
                C85315al.m146637a("VEEditor_VESequenceInvoker", "updateAudioTrack...");
                if (i < 0) {
                    return -100;
                }
                if (i3 <= i2 || i2 < 0) {
                    MethodCollector.m26664o(11966);
                    return -100;
                } else if (i5 <= i4 || i4 < 0) {
                    MethodCollector.m26664o(11966);
                    return -100;
                } else {
                    int updateAudioTrack = this.f191133b.updateAudioTrack(this.f191132a.f191852s.mo54955a(1, i), i4, i5, i2, i3, z, false);
                    MethodCollector.m26664o(11966);
                    return updateAudioTrack;
                }
            } finally {
                MethodCollector.m26664o(11966);
            }
        }
    }
}
