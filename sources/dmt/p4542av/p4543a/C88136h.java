package dmt.p4542av.p4543a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.p3487n.AbstractC61292a;
import com.p2082ss.android.ugc.aweme.p3487n.C61293b;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70898f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.tools.extract.C78588w;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dmt.av.a.h */
public final class C88136h {

    /* renamed from: a */
    int f200046a = -999;

    /* renamed from: b */
    private AbstractC61292a f200047b = new C61293b();

    static {
        Covode.recordClassIndex(104164);
    }

    /* renamed from: a */
    public final void mo142639a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String audioPath;
        String concatAudioPath;
        List<EditVideoSegment> videoList;
        C84911q.m145928d("OriginalSoundSeparator separateOriginalSoundVESDK");
        if (C78588w.C78589a.m137198a(videoPublishEditModel)) {
            new File(C70638dj.f158107j).mkdirs();
            if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord() || !C70898f.m125188a()) {
                z = false;
            } else {
                z = true;
            }
            int i = -999;
            if (videoPublishEditModel.isFastImport) {
                if (C71817eu.m126799j(videoPublishEditModel)) {
                    videoList = C88131e.m153202a(videoPublishEditModel.getPreviewInfo());
                } else {
                    videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
                }
                int size = videoList.size();
                String[] strArr = new String[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[2];
                float[] fArr = new float[size];
                m153208a(videoPublishEditModel.getPreviewInfo(), videoList, strArr, jArr, jArr2, fArr, jArr3);
                if (z) {
                    new File(C70638dj.f158111n).mkdirs();
                    String str = C70638dj.f158111n + System.currentTimeMillis() + "_a";
                    if (videoPublishEditModel.voiceVolume == 0.0f) {
                        this.f200046a = this.f200047b.mo98895a("FastImport_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                    } else {
                        this.f200046a = this.f200047b.mo98896a("FastImport_with_voice_record", str, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                        i = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
                        C80720e.m139931c(str);
                    }
                } else {
                    this.f200046a = this.f200047b.mo98896a("FastImport_without_voice_record", videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                }
            } else if (videoPublishEditModel.isMultiVideoEdit()) {
                VERecordData a = C71493a.m126273a(videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData);
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData.getPlayInOutTime();
                if (playInOutTime != null) {
                    a.mo130356a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
                }
                if (!z) {
                    this.f200046a = this.f200047b.mo98894a("MultiVideoEdit_without_voice_record", videoPublishEditModel.mEncodedAudioOutputFile, a);
                } else if (videoPublishEditModel.voiceVolume == 0.0f || !videoPublishEditModel.hasOriginalSound()) {
                    this.f200046a = this.f200047b.mo98895a("MultiVideoEdit_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    new File(C70638dj.f158111n).mkdirs();
                    String str2 = C70638dj.f158111n + System.currentTimeMillis() + "_a";
                    this.f200046a = this.f200047b.mo98894a("MultiVideoEdit_with_voice_record", str2, a);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str2);
                    arrayList2.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                    i = VEUtils.mixAudio(arrayList2, videoPublishEditModel.mEncodedAudioOutputFile, null);
                    C80720e.m139931c(str2);
                }
            } else if (videoPublishEditModel.isStitchMode()) {
                if (TextUtils.isEmpty(((StitchParams) Objects.requireNonNull(videoPublishEditModel.stitchParams)).getConcatAudioPath())) {
                    concatAudioPath = videoPublishEditModel.audioPath();
                } else {
                    concatAudioPath = videoPublishEditModel.stitchParams.getConcatAudioPath();
                }
                if (z) {
                    if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
                        this.f200046a = this.f200047b.mo98895a("stitch_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                    } else {
                        C85581w wVar = new C85581w(videoPublishEditModel.draftDir());
                        wVar.mo131623a(new String[]{videoPublishEditModel.veAudioRecorderParam.getAudioUrl()}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
                        int a2 = wVar.mo131608a(concatAudioPath, 0, wVar.mo131723s() - ((int) videoPublishEditModel.stitchParams.getDuration()), (int) videoPublishEditModel.stitchParams.getDuration(), wVar.mo131723s(), false);
                        wVar.mo131645a(0, 1, videoPublishEditModel.voiceVolume);
                        wVar.mo131645a(a2, 1, videoPublishEditModel.voiceVolume);
                        wVar.mo131678d(1);
                        VEAudioEncodeSettings.C85194a aVar = new VEAudioEncodeSettings.C85194a();
                        aVar.f190624b = 16000;
                        aVar.f190626d = 2;
                        aVar.f190625c = 128000;
                        VEAudioEncodeSettings a3 = aVar.mo130147a();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (wVar.mo131647a(videoPublishEditModel.mEncodedAudioOutputFile, a3, new VEListener.AbstractC85248q() {
                            /* class dmt.p4542av.p4543a.C88136h.C881371 */

                            static {
                                Covode.recordClassIndex(104165);
                            }

                            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                            public final void onCompileProgress(float f) {
                            }

                            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                            public final void onCompileDone() {
                                C88136h.this.f200046a = 0;
                                countDownLatch.countDown();
                            }

                            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                            public final void onCompileError(int i, int i2, float f, String str) {
                                countDownLatch.countDown();
                            }
                        })) {
                            try {
                                countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        wVar.mo131703j();
                    }
                } else if (concatAudioPath != null) {
                    this.f200046a = this.f200047b.mo98895a("stitch_without_voice_record", concatAudioPath, videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    this.f200046a = -999;
                }
            } else if (!videoPublishEditModel.isMvThemeVideoType()) {
                if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
                    audioPath = videoPublishEditModel.videoPath().toString();
                } else {
                    audioPath = videoPublishEditModel.audioPath();
                }
                if (!z) {
                    this.f200046a = this.f200047b.mo98895a("normal_without_voice_record", audioPath, videoPublishEditModel.mEncodedAudioOutputFile);
                } else if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
                    this.f200046a = this.f200047b.mo98895a("normal_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    this.f200046a = -999;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(audioPath);
                    arrayList3.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                    i = VEUtils.mixAudio(arrayList3, videoPublishEditModel.mEncodedAudioOutputFile, null);
                }
            } else if (z) {
                this.f200046a = this.f200047b.mo98895a("MV", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
            }
            int checkAudioFile = VEUtils.checkAudioFile(videoPublishEditModel.mEncodedAudioOutputFile);
            C34611o.m70671b("aweme_movie_publish_log", "encode_audio_file", new C69840ar().mo110187a("status", Integer.valueOf(checkAudioFile + 10000)).mo110189a("errorDesc", "mixResult" + i + "encodeResult = " + this.f200046a + " checkResult = " + checkAudioFile + " path = " + videoPublishEditModel.mEncodedAudioOutputFile).mo110191a());
        }
    }

    /* renamed from: a */
    private static void m153208a(EditPreviewInfo editPreviewInfo, List<EditVideoSegment> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        for (int i = 0; i < list.size(); i++) {
            EditVideoSegment editVideoSegment = list.get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
