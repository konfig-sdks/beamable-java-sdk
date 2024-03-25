package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.ActivityApi;
import com.konfigthis.client.api.AnnouncementApi;
import com.konfigthis.client.api.AuditApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BlockApi;
import com.konfigthis.client.api.CampaignApi;
import com.konfigthis.client.api.CloudsavingApi;
import com.konfigthis.client.api.ContentApi;
import com.konfigthis.client.api.CurrencyApi;
import com.konfigthis.client.api.EntitlementApi;
import com.konfigthis.client.api.EventApi;
import com.konfigthis.client.api.FriendApi;
import com.konfigthis.client.api.GameApi;
import com.konfigthis.client.api.GroupApi;
import com.konfigthis.client.api.HistoryApi;
import com.konfigthis.client.api.ItemApi;
import com.konfigthis.client.api.LeaderboardApi;
import com.konfigthis.client.api.LegacyEntitlementDefApi;
import com.konfigthis.client.api.LegacyPvpDefApi;
import com.konfigthis.client.api.MailApi;
import com.konfigthis.client.api.MessageApi;
import com.konfigthis.client.api.NotificationApi;
import com.konfigthis.client.api.ObjectApi;
import com.konfigthis.client.api.OrderApi;
import com.konfigthis.client.api.PaymentApi;
import com.konfigthis.client.api.PlanApi;
import com.konfigthis.client.api.PriceApi;
import com.konfigthis.client.api.ProductApi;
import com.konfigthis.client.api.PromoApi;
import com.konfigthis.client.api.RealmApi;
import com.konfigthis.client.api.RegistrationApi;
import com.konfigthis.client.api.SkuApi;
import com.konfigthis.client.api.SessionApi;
import com.konfigthis.client.api.ShardApi;
import com.konfigthis.client.api.StatisticApi;
import com.konfigthis.client.api.SubscriptionApi;
import com.konfigthis.client.api.TemplateApi;
import com.konfigthis.client.api.TimerApi;
import com.konfigthis.client.api.TournamentApi;
import com.konfigthis.client.api.TrialApi;
import com.konfigthis.client.api.UpdateApi;

public class Beamable {
    private ApiClient apiClient;
    public final AccountApi account;
    public final ActivityApi activity;
    public final AnnouncementApi announcement;
    public final AuditApi audit;
    public final AuthenticationApi authentication;
    public final BlockApi block;
    public final CampaignApi campaign;
    public final CloudsavingApi cloudsaving;
    public final ContentApi content;
    public final CurrencyApi currency;
    public final EntitlementApi entitlement;
    public final EventApi event;
    public final FriendApi friend;
    public final GameApi game;
    public final GroupApi group;
    public final HistoryApi history;
    public final ItemApi item;
    public final LeaderboardApi leaderboard;
    public final LegacyEntitlementDefApi legacyEntitlementDef;
    public final LegacyPvpDefApi legacyPvpDef;
    public final MailApi mail;
    public final MessageApi message;
    public final NotificationApi notification;
    public final ObjectApi object;
    public final OrderApi order;
    public final PaymentApi payment;
    public final PlanApi plan;
    public final PriceApi price;
    public final ProductApi product;
    public final PromoApi promo;
    public final RealmApi realm;
    public final RegistrationApi registration;
    public final SkuApi sku;
    public final SessionApi session;
    public final ShardApi shard;
    public final StatisticApi statistic;
    public final SubscriptionApi subscription;
    public final TemplateApi template;
    public final TimerApi timer;
    public final TournamentApi tournament;
    public final TrialApi trial;
    public final UpdateApi update;

    public Beamable() {
        this(null);
    }

    public Beamable(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.activity = new ActivityApi(this.apiClient);
        this.announcement = new AnnouncementApi(this.apiClient);
        this.audit = new AuditApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.block = new BlockApi(this.apiClient);
        this.campaign = new CampaignApi(this.apiClient);
        this.cloudsaving = new CloudsavingApi(this.apiClient);
        this.content = new ContentApi(this.apiClient);
        this.currency = new CurrencyApi(this.apiClient);
        this.entitlement = new EntitlementApi(this.apiClient);
        this.event = new EventApi(this.apiClient);
        this.friend = new FriendApi(this.apiClient);
        this.game = new GameApi(this.apiClient);
        this.group = new GroupApi(this.apiClient);
        this.history = new HistoryApi(this.apiClient);
        this.item = new ItemApi(this.apiClient);
        this.leaderboard = new LeaderboardApi(this.apiClient);
        this.legacyEntitlementDef = new LegacyEntitlementDefApi(this.apiClient);
        this.legacyPvpDef = new LegacyPvpDefApi(this.apiClient);
        this.mail = new MailApi(this.apiClient);
        this.message = new MessageApi(this.apiClient);
        this.notification = new NotificationApi(this.apiClient);
        this.object = new ObjectApi(this.apiClient);
        this.order = new OrderApi(this.apiClient);
        this.payment = new PaymentApi(this.apiClient);
        this.plan = new PlanApi(this.apiClient);
        this.price = new PriceApi(this.apiClient);
        this.product = new ProductApi(this.apiClient);
        this.promo = new PromoApi(this.apiClient);
        this.realm = new RealmApi(this.apiClient);
        this.registration = new RegistrationApi(this.apiClient);
        this.sku = new SkuApi(this.apiClient);
        this.session = new SessionApi(this.apiClient);
        this.shard = new ShardApi(this.apiClient);
        this.statistic = new StatisticApi(this.apiClient);
        this.subscription = new SubscriptionApi(this.apiClient);
        this.template = new TemplateApi(this.apiClient);
        this.timer = new TimerApi(this.apiClient);
        this.tournament = new TournamentApi(this.apiClient);
        this.trial = new TrialApi(this.apiClient);
        this.update = new UpdateApi(this.apiClient);
    }

}