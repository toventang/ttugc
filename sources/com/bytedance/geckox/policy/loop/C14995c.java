package com.bytedance.geckox.policy.loop;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.loop.c */
public final class C14995c {

    /* renamed from: a */
    public int f36633a;

    /* renamed from: b */
    public Map<String, LoopRequestModel> f36634b = new ConcurrentHashMap();

    /* renamed from: c */
    public AbstractC14997a f36635c;

    /* renamed from: d */
    private Handler f36636d;

    /* renamed from: e */
    private String f36637e;

    /* renamed from: f */
    private AtomicBoolean f36638f = new AtomicBoolean(false);

    /* renamed from: com.bytedance.geckox.policy.loop.c$a */
    public interface AbstractC14997a {
        static {
            Covode.recordClassIndex(17134);
        }

        /* renamed from: a */
        void mo24219a(Map<String, LoopRequestModel> map);
    }

    static {
        Covode.recordClassIndex(17132);
    }

    /* renamed from: b */
    public final void mo24216b() {
        this.f36638f.set(false);
        this.f36636d.removeMessages(this.f36633a);
        this.f36634b.clear();
    }

    /* renamed from: c */
    public final void mo24217c() {
        this.f36638f.set(true);
        Message obtainMessage = this.f36636d.obtainMessage();
        obtainMessage.what = this.f36633a;
        obtainMessage.arg1 = 3;
        this.f36636d.sendMessageDelayed(obtainMessage, (long) (this.f36633a * 1000));
    }

    /* renamed from: a */
    public final void mo24212a() {
        int i = this.f36633a;
        if (i != 0 && !this.f36636d.hasMessages(i) && !this.f36638f.get()) {
            C14957a.m27543a("[loop]start loop,interval level:", this.f36637e, ",combine deployments:", this.f36634b);
            mo24217c();
        }
    }

    /* renamed from: a */
    private LoopRequestModel m27602a(String str) {
        LoopRequestModel loopRequestModel = this.f36634b.get(str);
        if (loopRequestModel == null) {
            return new LoopRequestModel(new HashMap(), new LoopRequestModel.LoopDeploymentModel());
        }
        return loopRequestModel;
    }

    /* renamed from: a */
    public final void mo24213a(int i) {
        if (this.f36633a != i) {
            if (this.f36638f.get()) {
                this.f36636d.removeMessages(this.f36633a);
                this.f36638f.set(false);
            }
            this.f36633a = i;
            mo24212a();
        }
    }

    /* renamed from: a */
    public final void mo24215a(List<GlobalConfigSettings.SyncItem> list) {
        if (!(list == null || list.isEmpty())) {
            for (GlobalConfigSettings.SyncItem syncItem : list) {
                m27603a(syncItem.getAccessKey(), syncItem.getGroup(), syncItem.getTarget());
            }
        }
    }

    public C14995c(String str, int i) {
        this.f36637e = str;
        this.f36633a = i;
        HandlerThread handlerThread = new HandlerThread("combine", 3);
        handlerThread.start();
        this.f36636d = new Handler(handlerThread.getLooper()) {
            /* class com.bytedance.geckox.policy.loop.C14995c.HandlerC149961 */

            static {
                Covode.recordClassIndex(17133);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.arg1 == 3) {
                    C14957a.m27543a("[loop]loop msg.what:", Integer.valueOf(message.what), "interval:", Integer.valueOf(C14995c.this.f36633a), "time:", Long.valueOf(System.currentTimeMillis()));
                    if (C14995c.this.f36634b != null && !C14995c.this.f36634b.isEmpty()) {
                        if (C14995c.this.f36635c != null) {
                            C14995c.this.f36635c.mo24219a(C14995c.this.f36634b);
                        }
                        C14995c.this.mo24217c();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    private void m27603a(String str, List<String> list, List<String> list2) {
        LoopRequestModel a = m27602a(str);
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && !a.getDeployment().getGroupName().contains(str2)) {
                    a.getDeployment().getGroupName().add(str2);
                }
            }
        }
        if (list2 != null) {
            for (String str3 : list2) {
                Iterator<CheckRequestBodyModel.TargetChannel> it = a.getDeployment().getTargetChannels().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().channelName.equals(str3)) {
                            break;
                        }
                    } else {
                        a.getDeployment().getTargetChannels().add(new CheckRequestBodyModel.TargetChannel(str3));
                        break;
                    }
                }
            }
        }
        this.f36634b.put(str, a);
    }

    /* renamed from: a */
    public final void mo24214a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, Map<String, Map<String, Object>> map2) {
        if (map != null) {
            for (String str2 : map.keySet()) {
                LoopRequestModel a = m27602a(str2);
                if (!TextUtils.isEmpty(str) && !"default".equals(str) && !a.getDeployment().getGroupName().contains(str)) {
                    a.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str2) == null)) {
                    a.getCustom().putAll(map2.get(str2));
                }
                List<CheckRequestBodyModel.TargetChannel> list2 = map.get(str2);
                if (list2 == null || list2.isEmpty()) {
                    this.f36634b.put(str2, a);
                } else {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : list2) {
                        Iterator<CheckRequestBodyModel.TargetChannel> it = a.getDeployment().getTargetChannels().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().channelName.equals(targetChannel.channelName)) {
                                    break;
                                }
                            } else {
                                a.getDeployment().getTargetChannels().add(targetChannel);
                                break;
                            }
                        }
                    }
                    this.f36634b.put(str2, a);
                }
            }
        } else if (!TextUtils.isEmpty(str) && !"default".equals(str) && list != null && !list.isEmpty()) {
            for (String str3 : list) {
                LoopRequestModel a2 = m27602a(str3);
                if (!TextUtils.isEmpty(str) && !a2.getDeployment().getGroupName().contains(str)) {
                    a2.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str3) == null)) {
                    a2.getCustom().putAll(map2.get(str3));
                }
                this.f36634b.put(str3, a2);
            }
        }
    }
}
