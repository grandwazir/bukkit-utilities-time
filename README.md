BukkitUtilities (Time)
====================================

BukkitUtilities (Time) is a library for the Minecraft wrapper [Bukkit](http://bukkit.org/) that enables rapid development of plugins by providing classes and interfaces for common tasks. 

The aim of the library is to reduce the amount of boiler plate code which is duplicated between plugins and provide a consistent approach to a number of problems. At the moment it is used exclusively by all the plugins that I maintain or develop. 

## Features

- Allows the conversion of human readable times into Unix time and back again.
- Allows for formatting Unix time in a approximate style ala FaceBook or Twitter.

## License

BukkitUtilities is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

BukkitUtilities is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

## Installation

The likelihood is if you are using a plugin which requires BukkitUtilities, it has been included with the plugin and you do not need to download this separately. This is the preferred method of distribution at this time.

If however you wish to use BukkitUtilities in your own plugin, the best way to get a copy is add the following to the pom.xml of your Maven project. This will automatically download the dependency when you next compile your plugin.

    <repositories>
       <repository>
         <id>my-repo</id>
         <url>http://repository.james.richardson.name</url>
       </repository>
    </repositories>

    <dependencies>
       <dependency>
             <groupId>name.richardson.james.bukkit</groupId>
             <artifactId>bukkit-utilities-time</artifactId>
       </dependency>
    </dependencies>

Alternatively if you do not wish to use Maven you can download the latest version from the [repository](http://repository.james.richardson.name/releases/name/richardson/james/bukkit/bukkit-utilities-time) directly.

## Reporting issues

If you are a server administrator and you are encountering an issue with a plugin that uses BukkitUtilities, you should contact the author of that plugin directly for support. If you are a plugin developer and you want to make a bug report or feature request please do so using the [issue tracking](https://github.com/grandwazir/BukkitUtilities/issues) on GitHub.
