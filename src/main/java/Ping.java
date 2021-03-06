import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Ping extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        if(msg.equalsIgnoreCase("пинг")||msg.equalsIgnoreCase("ping")){
            event.getChannel().sendMessage("Понг").queue(message -> {
                message.editMessage(event.getJDA().getGatewayPing()+"ms").queue();
            });
        }
    }
}
