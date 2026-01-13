# NOTICE: Gork has been discontinued
In light of what Grok (the thing this plugin was making fun of) has been doing on Twitter, and neither the platform nor its owner taking any apparent interest in doing anything to stop such behaviour, I have decided to archive the Gork repo.

Despite initially a humorous jab at how stupid the concept of Grok is, things have become significantly more serious over the past few weeks, and I can't say I feel particularly happy or comfortable continuing to host a repository in reference to the bot. While renaming the repository and plugin is an option I did briefly consider, ultimately I think that for a multitude of reasons it's simply not worth doing.

Consider Gork to now be EOL. All versions of Gork on both Modrinth and CurseForge will be removed, and their corresponding pages archived. The source will remain on GitHub for the time being, but no effort to port the source to other code forges will be made, and could be removed from GitHub in the future.

Hopefully, those responsible for Grok are held accountable for all the harm they have caused.

Original README (with minor tweaks) below.

# Gork Plugin

This plugin just responds with "yeh" to a list of configurable requests.

That's *literally* all it does.

Heavily inspired by [@natalie.sh](https://bsky.app/profile/natalie.sh)'s Bluesky bot of the [same name](https://bsky.app/profile/did:plc:fwvdvvwstpxpftnbnjiwcsux) ([GitHub Repo](https://github.com/espeon/gork))

(If for whatever reason you'd like this taken down Natalie, message me on Bluesky and I'll be more than happy to facilitate 🙂‍↕️)

## Configuration

The bot can be easily configured in the plugin's `config.yml` file, allowing you to:

- Change the prefix for the bot (i.e. `@gork` -> `@cahtgtp`)
- Add / remove trigger phrases for the bot
- Enable / disable coloured `@{username}` for the person that triggered it

The config can then be easily reloaded using the `/gorkload` command.
## For the avoidance of doubt...
This plugin does *not* utilize *any* machine learning or "artificial intelligence" technologies, generative or otherwise. 

Finally, not affiliated with Twitter, xAI, or any derivative / future name those companies / platforms happens to have.
